import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


/**
 * LogReader
 */
public class LogReader {


	/**
	 * Read log content from provided url
	 *
	 * @param url url to logfile
	 * @return List<LogModel>
	 * @throws IOException IOException
	 */
	public List<LogModel> readLog(String url) throws IOException {

		//We save the information into a String builder first cuz we use just one thread and not need synchronization between threads
		//In that case we can use String builder that can work better with multitask programs
		StringBuilder retStr = new StringBuilder();
		// We create the interface Client that will send the http method, in this case get to the define URI/Server
		HttpClient httpclient = HttpClientBuilder.create().build();
		//DefaultHttpClient httpclient = new DefaultHttpClient();

		// To get the logs the client net to have a request and these case
		// we net a get and for that we use the Class HttpGet , where  we give the Request Uri defined on parameter
		// url , in these case we above to use a URI builder to split the resources of the request
		HttpGet httpGetRequest = new HttpGet(url);
		// We need to save the response of the Server using the class HttpResponse, and initializing content using the defined get Request
		HttpResponse httpResponse = httpclient.execute(httpGetRequest);
		// And these case the response carry a content on a entity , to see the content we use the method
		// Get entity that returns a inputStream object
		HttpEntity entity = httpResponse.getEntity();
		// We defined a buffer  , space of memory where we obtain the the values no direct from server , they will save on the buffer
		byte[] buffer = new byte[1024];
		if (entity != null) {
			// We save the content in bytes
			// of the Entity on the Stream to access and save the information and can be modified later
			InputStream inputStream = entity.getContent();
			// When we use the method read we need to use a try catch to handle the error
			try {
				int bytesRead;
				// We create a Buffer InputStream that will have the on an array of byte[] that can be after read
				// we make this to read and decodes the bytes to corresponding value
				BufferedInputStream bis = new BufferedInputStream(inputStream);
				/**
				 * Using the read method fo the the class ImputStream , while the bis return the unicode number value until the
				 * last value inside the impustream then it will return a -1 and the loop while be close, read every bytes on the array
				 * obtain the unicode value as int and then will be decoded to corresponding char value
				 */
				while ((bytesRead = bis.read(buffer)) != -1) {
					// decode the value of buffer with a maximal buffer of value bytes to decode of 1024, and wil decode
					// the bytes at the index 0 of the byte[]
					String chunk = new String(buffer, 0, bytesRead);
					// then we add these decoded string into the StringBuilder element that will be modified in other moments
					retStr.append(chunk);
				}
			} catch (IOException ioException) {
				// In case of an IOException the connection will be released
				// back to the connection manager automatically
				ioException.printStackTrace();
			} catch (RuntimeException runtimeException) {
				// In case of an unexpected exception you may want to abort
				// the HTTP request in order to shut down the underlying
				// connection immediately.
				httpGetRequest.abort();
				runtimeException.printStackTrace();
			} finally {
				// Closing the input stream will trigger connection release
				try {
					inputStream.close();
				} catch (Exception ignore) {
				}
			}
		}
		return mapToList(retStr.toString());
	}

	/**
	 * Using regular expressions we give specific format to the received string
	 * @param StringBuldider objectin String format with the original message content
	 * @return
	 */
	private List<LogModel> mapToList(String s) {

		// we separetes every content in lines and save every value on a String[]
		String[] lines = s.split("(?=\\d{4}-)");
		// then we casting the information to a LogModel and save these on a List of<LogModel> Objects
		return Arrays.stream(lines).map(this::mapToLogModel).collect(Collectors.toList());
	}

	/**
	 *  The format information will be save or builder simplify into a LogModel
	 * @param String with the content
	 * @return LogModel with the specified identifies
	 */
	private LogModel mapToLogModel(String s) {
		LogModel logModel = new LogModel();
		// Format fo the String to save
		String pattern = "(\\d{4}.+,\\d{3})\\s+\\[(\\S+)]\\s+from\\s+(\\S+)\\s+in\\s+(\\S+)\\s-\\s(.*)";
		Pattern r = Pattern.compile(pattern);
		Matcher matcher = r.matcher(s.replaceAll("\\n","\t"));
		if (matcher.find( )) {
			logModel.setTimestamp(LocalDateTime.parse(matcher.group(1).replace(' ','T').replaceAll(",.+","")));
			logModel.setLogLevel(matcher.group(2));
			logModel.setClassName(matcher.group(3));
			logModel.setTaskName(matcher.group(4));
			logModel.setMessage(matcher.group(5));
			logModel.setExceptionMessage(expractExceptionMessage(matcher.group(5)));
		}
		return logModel;
	}

	/**
	 * Rewrite and give format to exceptionMessage present on the content
	 * @param exception message to give format
	 * @return the exception message group as string with the expected format
	 */
	private String expractExceptionMessage (String message) {
		String retVal = null;
		String pattern = "(\\S+Exception:.+?)\\t";
		Pattern r = Pattern.compile(pattern);
		Matcher matcher = r.matcher(message);
		if (matcher.find( )) {
			retVal =  matcher.group(1);
		}
		return retVal;
	}
}



