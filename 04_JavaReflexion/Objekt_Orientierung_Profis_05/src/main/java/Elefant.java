/**
 * Created by JefeMaestro on 13.05.2017.
 */

/**
 *
 */

public class Elefant extends Tier {


    private int beine = 4;

    @Override
    public void macheDichBewerbar() {

        System.out.println("Torb");
    }

    /*
    Rekursion
    wir überschreiben den fFunktion doSomething
     */

    @Override
    public void doSomething(int i){

        /**
         * wir geben
         * was wird es hier passiert
         */
        System.out.println("Bluub");
        if (i == 0)
        {
            return;
        }
        // hier sollten den d someething von Tier aber nicht
        // hider wenn wir zum Tier gehen this is noch this von typ Elefant
        // deshalb geben wir aus dem Blubb von Elefant is implicit abgecastest
        // wir haben immer This von dosomeThen this der Klasse Elefant
        // und nicht der Super Klasse Tier
        super.doSomething(i);
    }


    /*public int getBeine() {
        return this.beine;
    }*/

}
