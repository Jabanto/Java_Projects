/**
 * Created by JefeMaestro on 13.05.2017.
 */
public class Hund extends Tier {

    public int beine = 5;

    @Override
    public void macheDichBewerbar() {

        System.out.println("Woff");
    }


    public int getBeine() {

        /**
         * hier mit this verwenden wir als Override dann liefert uns dem Anzahl 5 zuruck
         * dasselbe für Elefant
         *
         * ohne this dann wird dem Anzahl vor die Abstract  Klass Tier übergitb.
         * das ist innerhalb der Klasse
         */

        return this.beine;
    }

}
