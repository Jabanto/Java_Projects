import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by JefeMaestro on 07.05.2017.
 */
public class Main {

    // um es zwar Wirkliche zugrifft auf die selbe Variable  die wird auch verändert innnerhalb von verschieden Threads
    // das ist coll denn wir können doppel zu schnell irgenwelche Variable verandert werden oder nicht.

    public static void main(String[] args) {

        // neue Variable die möchte diese Thread übergeben
        Blubb b = new Blubb();



        CustomThreads t1 = new CustomThreads("erster Fred", b, true);
        CustomThreads t2 = new CustomThreads("zeiter Fred", b, false);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            // TODO: 07.05.2017 Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Ende des Programms");

        //

    }
}
