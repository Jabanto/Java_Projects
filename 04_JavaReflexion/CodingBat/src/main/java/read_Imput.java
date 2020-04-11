import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JAbanto on 05.10.2017.
 */


public abstract class read_Imput {


    public static void readInput()throws IOException {

        InputStreamReader imput = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(imput);
        System.out.println("Bitte geben Sie  Nummer oder Carakter ein");
        String eingabe = br.readLine();

    }
}
