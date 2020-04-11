/**
 * Created by JefeMaestro on 07.05.2017.
 */
public class Blubb {

    // dass die Klasse, in der die auf selbe variable zugregreifen werden soll.

    boolean flag = false;

    // wewnn wir zwei flag haben und danach machen wir noch eine if scleife in der first Methode
    // dann sollen wir aufpassen dann könne wir beides Threads stoppen und das wäre ein sogenanten
    // DeadLock, um das zu vermeiden dann sollen wir unsere code saubern screiben oder könne wir auch das verwalten
    // also mehr paralalisieren und mehr threads generieren. also hier ist wichtig dass die Threads nicht
    // gegenseitig sich blokieren

    boolean flag2 = true;

    // diese zwei methode werden gleichzeitig laufen eine pro Thread

    public synchronized void  first(){

        // wir greifen auf die selbe Varaible hier,
        // wir erstellen zwei Thread jede  kriegt ein Blubb, ist das Selbe Blubb also wir geliefern das selbe Flag
        // also die Erste Thread grifft zum diese Methiod und die zweiter zum Den andere Methode zu
        // so beides die  Variable sollen die variable Flag verändert
        // also wenn die erste thread fertig ist dann beginnt die näschte


        /*if (flag2) {
            try {
                // thath soll er raten , wait() sollen wir mit try catch anfangen
                wait();

            }catch (InterruptedException e){
                // TODO: 07.05.2017  Auto genereated catch  block
                e.printStackTrace();
            }
        }
        */

        // wenn das activiert könnnen wir ein DEADlOCK haben, das  heiss
        // ein thread warte auf andere und so weiter,


        // wenn nicht wahr ist dann spring bis die Ausgabe , bei flag = false;
        if (flag) {
            try {
                // thath soll er raten , wait() sollen wir mit try catch anfangen
                // wait heiis dass the Thrad warten soll
                wait();

            }catch (InterruptedException e){
                // TODO: 07.05.2017  Auto genereated catch  block
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der erste");
        flag  = true;
        //flag2 = true; um die Deadlock zu vermeiden
        notify();

    }

    public synchronized  void second(){

        /*
        if (!flag2) {
            try {
                // thath soll er raten , wait() sollen wir mit try catch anfangen
                wait();

            }catch (InterruptedException e){
                // TODO: 07.05.2017  Auto genereated catch  block
                e.printStackTrace();
            }
        }
        */

        // wir greifen auf die selbe Varaible hier,

        if (!flag) {
            try {
                wait();
            }catch (InterruptedException e){
                // TODO: 07.05.2017  Auto genereated catch  block
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der zweite");
        flag  = false;

        // flag2 =  false; DEADLOCK deaktivieren

        // damir er noch nicht die erste Method verwendt
        // das bedeutet er benachrichte alle andere Threads
        notify();

    }
}
