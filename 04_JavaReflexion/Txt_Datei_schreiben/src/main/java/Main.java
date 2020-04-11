import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by JAbanto on 19.06.2017.
 * wie kann man ein Textdateio erstellt und reinschreibt bzw. sie sogar überschreibt.F
 *
 */
public class Main {

    public static void main(String[] args) {

        FileWriter writer;
        File datei = new File("Soundso_Datei_Schreiben.txt");


        try{

            // wenn wir true screiben , dann werden nicht falls diese Datei, exitiert, überschreiben.
            // Ohne True wird die datei noch mal neu geschrieben.
            writer = new FileWriter(datei, true);

            writer.write("ich bin eine Datei");
            // aws der macht , eine neue Zeile unhangegit von Systeme.
            writer.write(System.getProperty("line.separator"));


            // es wäre angebracht

            writer.flush();
            writer.close();

        }catch (IOException e){
                // TODO Auto-generated cath
            e.printStackTrace();

        }

    }

}
