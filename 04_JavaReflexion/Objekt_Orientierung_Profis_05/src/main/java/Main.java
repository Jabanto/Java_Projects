import java.util.ArrayList;

/**
 * Created by JefeMaestro on 13.05.2017.
 *  /**
 * In diesem Tutorial  erkläre ich euch wichtige Hintergrundinformation zu dem Schlüsselwort "Private"
 *
 * also in Java müssen wir mit Rekursion anpassen den The MEthoden Sind dynamish verbunden
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
            //tiere.get(i).macheDichBewerbar();
        }

        System.out.println("<----Schlüsselwort Private----->");

        /**
         * was passsier wenn in Elfant klasse die Methode getBeine von TierAufrufe
         */

        Elefant t = new Elefant();
        // hier rufen die Methode getBeine Von typ Tier
        // wenn wir wollen die Beine Von Elefant aufrufen dann sollen
        // wir dieses Methode getBeine in Elefeatn schreiben also überschreiben
        System.out.println(t.getBeine());





    }
}
