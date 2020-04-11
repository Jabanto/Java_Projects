import javafx.geometry.VPos;

/**
 * Created by JefeMaestro on 07.05.2017.
 *
 * Komunikation zwischen Threads und Prozessen
 * 1 haben wir ein erste Trhead 1 , der die Comunicator object übergeben
 * dann diese Run Methode und erstellt sich dann denn Thread, in der man
 * ein nuen Thread kreiren und des runnable übergbit und than diese
 * thread starten
 *
 * the mehtoden sind syncronized
 *
 */
public class Communicator {

    // diese Flag Variable um die Methoden zu sincronisen

    // dann könne wir nicht notify() oder Syncronized verwendet in der Method
    // dann brauchen wir while

    // TODO: 08.05.2017 Vollatil datentyp durchschauen
    volatile  boolean flag = false;
    //boolean  flag = false;
    /* hier was wir zeigen möchte ist das  wir können auf irgenwelche
    *
    * variable  zugreifen können
    * diese variabke kann ein primitive daten type sein oder auch ein komplexe wie String Object
    *
    * ein einziges Methode auf ein Objekt , dass bedeutet auf disese Kominkateor , kann auf alle mehtoden
    * die syncronized sind immer nur eine auf einmal ausgeführt werden für den Thread , wenn wir ein Thread haben es egak
    * aber bei multithread haben dann wird immer
    *
    * HIER ES GUT SAGEN DASS WICHTIG IST DASS DIE PROGRAMM PARALEL:LEL LÄUF
    *
    *
    */

    int anInt = 0;

    String string = "";

    //public synchronized void q(String msg){

    public void q(String msg){

        /* if (flag){
            try {
                wait();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }*/

        while (flag){
        }
            System.out.println(msg);
            flag = true;



        // es wacht ein Thread , der ein wait methode verwendt hat
        // aufwächt
        // anInt = 1; // Variable die beides Threas zugreifen können.
        // string = "Thread 1";
        // notify();

    }


    /* was passier wenn wir sychronized weg machen , wenn wir ein Methode haben
    *
     * wie Wait() tha soll the methode Syncronized funktioniert
    */
    public void a(String msg){

        //es gibt synchronized blocke, mit diese kann ich fehler bekommen

        // synchronized (){}

        // wen ich wait() verwende, also nur bei methode void.


        /*
        if (!flag)
        {
            try {
                // ich lege the Thread schlafen
                // den näachte Thread kann nur weiter machen wenn die aktuell ein wait() methode hat
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }*/
        while (!flag) {
        }
        System.out.println(msg);
        flag = false;
        /*if (anInt==1){
            System.out.println("a ist 1");
            }*/
        //System.out.println("Letzte Veänderung in " + string);
        //string = "";

        //zweite Variable
        //anInt = 2;
        //notify();

    }

    public static void main(String[] args) {

        Communicator c = new Communicator();

        // wir erstelln ein Tread , der ein neues Thread1 erzeugt;

        new Thread(new Thread2(c)).start();
        new Thread(new Thread1(c)).start();

    }

}
