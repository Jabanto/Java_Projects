/**
 * Created by JefeMaestro on 07.05.2017.
 */
public class Thread2 implements Runnable{

    // Thread 2 macht das selbe als Thread 1

    Communicator c;

    public Thread2(Communicator c){

        this.c = c;
    }

    public void run(){
        c.a("gut");
        c.a("langweile");
        c.a("UTS");
    }

}

