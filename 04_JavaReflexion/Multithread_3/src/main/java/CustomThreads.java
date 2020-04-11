/**
 * Created by JefeMaestro on 07.05.2017.
 */
public class CustomThreads  extends Thread{
    String nameStrg;

    Blubb blubb;

    boolean flag;

    public CustomThreads(String s, Blubb b, boolean c){
        this.nameStrg = s;
        this.blubb = b;
        this.flag = c;

    }

    // diese Method sag was the Tread machen soll
    public void run(){

        // dann the Thrad wird sein name ausgeben
        System.out.println("Starte Thread " + nameStrg);
        for (int i=0;i<5;i++) {

            if (flag){
                blubb.first();
            }else {
                blubb.second();
            }
        }
        System.out.println("Beende Thread " + nameStrg);

    }

}
