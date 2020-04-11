/**
 * Created by JefeMaestro on 13.05.2017.
 */
public abstract class Tier {

    // Diese Atribut wird  immer vom der Klasse gehoren
    private int beine = 1;

    public  void macheDichBewerbar(){


        System.out.println("Tier");
    };

    public int getBeine(){

        // bin sicher wird nur hier verwendt
        this.lassBeinewachsen();
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


    /**
     * diese methode wir nicht veerbt und sin wir sicher thas diese TMehode is nur der Klasse Tier
     * das ist wie bei privaten Atributen also dies EMthoden ist nicht dynamisch verbunden
     * auch die Atributten die drinnen deklariert wurden
     */

    private void lassBeinewachsen(){
        // und diese Wert ist auch vom Tier und nicht vom untere Klasse
        this.beine++;
    }






}
