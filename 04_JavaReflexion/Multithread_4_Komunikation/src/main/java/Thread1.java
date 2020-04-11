/**
 * Created by JefeMaestro on 07.05.2017.
 */
public class Thread1  implements Runnable {

    // wir können ein Thread erstellen  entweder die extens class Thread oder
    // implemtieren
    // Runnable  class aber dann sollen wir method run
    // überschreiben funktionieren fasst gleich

    Communicator c;

    public Thread1(Communicator c){

        this.c  = c;
    }

    public void run(){
        c.q("Wie gehts dir?");
        c.q("Was is lost?");
        c.q("willst du zocken");

    }


}
