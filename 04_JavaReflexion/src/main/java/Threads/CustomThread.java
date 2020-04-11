package Threads;

/**

 * Created by JefeMaestro on 07.05.2017.
 * In diesem Video die ersten Schritte zum parallelisierten Programmcode in Java.
 * Schneller und effizienter, da endlich alles auf mehreren CPU-Kernen läuft.
 * Multithreading 1
 *
 */

public class CustomThread extends Thread {

    String nameStrg;

    // bei atomaren datentyp, Integer class die nch mehfh als di int datentyp  hat also classe und nicht proímitive int
    Integer counter;

    // übergeben wir name und Variable  Integer
    public CustomThread(String s, Integer counter){
        this.nameStrg = s;
        this.counter = counter;
    }

    // diese Method sag was the Tread machen soll
    public void run(){

        // dann the Thrad wird sein name ausgeben
        System.out.println("Starte Thread " + nameStrg);

        // um zu syscronizieren dauer ein bischen mein aber dafur ist Syscrom
        // durch diese zuerst kann man nur zugrifft auf die Variable ,counter haben bis die erste beenden ist , danach
        // kann die näachte Thread ausgefürht
        synchronized (counter) {

            for (int i =  0; i < 5; i++) {

                try {
                    // dann  schlafen gehewn
                    Thread.sleep(100);
                    // für die Syscrinisierung also counter ausgeben und
                    System.out.println(counter++);
                    // wenn etwas hat then Thread gekill
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }
        }


        System.out.println("Beende Thread " + nameStrg);

    }

}
