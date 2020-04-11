/**
 * Created by JefeMaestro on 13.05.2017.
 */
public abstract class Tier {

    public int beine = 1;

    public  void macheDichBewerbar(){

        System.out.println("Tier");
    };

    public int getBeine(){
        return this.beine;
    }

    /*
    Rekusion
    Also wir sagen hier, wir verrigern eine Variable
    wenn die null ist, dann machen wir nich mehr weiter
    ahn sonstens machen wir den ganzen weiter bz bei figonachi
     */
    public void doSomething(int i){


        System.out.println(i);
        if (i ==0 ){
            return;
        }
        this.doSomething(i - 1 );
    }



}
