import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Main Class
 * This Class read from a Folder on different Sample Projects and read only a especified Type of Logs
 * to avoid overload of not necessary Logs , Just to Take Logs with important Level like Fatal or Error
 *
 */
public class Main {

    /**
     * Main Method
     * @param args arguments
     */
    public static void main(String[] args) {


        Map<String,String> rsStorageURL = new HashMap<String, String>();

        rsStorageURL.put("UriKeyTest_1","http://10.1.190.4:8080/#/applications/074a2fe5/logfile");
        rsStorageURL.put("UriKeyTest_2","http://10.1.190.4:8080/#/applications/41d2bcc7/logfile");
        rsStorageURL.put("UriKeyTest_3","http://10.1.190.4:8080/#/applications/aa02e5ff/logfile");

        // Test Url
        String url = "http://10.1.190.4:8080/api/applications/f167be5d/logfile";

        // Using the nested Interface Map.Entry to have acces to the values of the Map using a for and the entrySet Method
        // that returns a set view of the mappings contained on the map rsStorageUrl
        for(Map.Entry<String,String> liste: rsStorageURL.entrySet()){

            String keyStrg = liste.getKey();
            String urlListe = liste.getValue();
            System.out.println(keyStrg);
            LogReader lr = new LogReader();
            try {
                //Save all the logs founded on the specified URL
                List<LogModel> content =  lr.readLog(url);
                // Filter the logs using filter method form Interface Stream to delete al logs with level INFO
                List<LogModel> contentFiltered = content.stream().filter(con->con.getLogLevel().equals("INFO")).collect(Collectors.toList());
                //Print the content after the filter
                contentFiltered.forEach(System.out::println);
                System.out.println("######################");
                // for the content well be realize a extra filter to take the logs that messages and created and the last hour
                Map<String, Long> map = content.stream()
                        .filter(log -> log.getExceptionMessage() != null && log.getTimestamp().isAfter(LocalDateTime.now().minusHours(1))) // last hour
                        .collect(Collectors.groupingBy(LogModel::getExceptionMessage, Collectors.counting()));
                // Print the result using string method format and displays content and key
                map.forEach((key,value)->System.out.println(value + " -> "  + key));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
