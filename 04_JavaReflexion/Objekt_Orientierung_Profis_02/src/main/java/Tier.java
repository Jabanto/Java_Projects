/**
 * Created by JefeMaestro on 13.05.2017.
 */
public abstract class Tier {

    /**
     * wenn man nichsst macht esis immer null
     */


    /**
     * also atribute sind static vewinden nicht wie Methoden die überschreiben sein können
     */
    public int beine = 1 ;

    public void macheDichBewerbar()  {

        System.out.println("Tier");
    }

    /**
     *  geerbt automatisch diese Methode in unsere Unterklasse {@link Hund} und
     *  {@link Elefant}  d.H hier in Hund und Elefant haben wir dieses Method
     * @return
     */

    public int getBeine() {
        return beine;
    }



}
