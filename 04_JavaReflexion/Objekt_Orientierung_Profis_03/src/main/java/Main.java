import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

/**
 * Created by JefeMaestro on 13.05.2017.
 *  /**
 * In diesem Tutorial gebe ich euch weitere,
 * tiefere Informationen zum Schlüsselwort
 * Super und zu Typecasts. Folgt mir auf
 */

public class Main {

    public static void main(String[] args) {
        /**
         * d.h Hier drin in diese Tiere Liste
         */

        /**
         * und hier können wir einfach sagen
         * die Tiere mache sich bemerkbart
         */

        ArrayList<Tier> tiere = new ArrayList<Tier>();

        tiere.add(new Hund());
        tiere.add(new Elefant());
        tiere.add(new Tier() {
            @Override
            public void macheDichBewerbar() {

                /**
                 * wir haben ein ANONYME INNERE KLASSE ERSTELLT
                 */
                System.out.println("miua");
            }
        });

        for (int i=0; i <tiere.size();i++)
        {
            tiere.get(i).macheDichBewerbar();

            System.out.println(tiere.get(i).getBeine());
        }

        System.out.println("<---------TypeCast----------->");




        /**
         * Typecast :
         * wir erstellen ein Hund
         * zuaerst haben wir ein beispielt von UPCast
         * also von Hund nach Tier
         * bekommen Bemerkung von Hund
         * also wird automatisch Woff ausgegeben
         * also implicite Typecast
         */

        Hund h = new Hund();
        //Tier von Hund
        Tier t =  (Tier)h;
        t.macheDichBewerbar();
        System.out.println(t.beine);

        /**
         * aber bei DownCast also explicite
         * uPcast
         * wir sagen hier , wir kreiern ein  neues Tier
         *
         *
         */

        Tier downHund = new Hund();
        // also das könne wir nicht implicit machen

        // Hund downTier = downHund;
        //  von Hund nach Tier sollen explicit machen
        Hund downTier =(Hund)downHund;
        t.macheDichBewerbar();


    }
}
