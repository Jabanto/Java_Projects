import java.util.ArrayList;

/**
 * Created by JefeMaestro on 13.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Hier sehen wir warum  Objectorientieurng cool ist , weil wir hier tatsächlicht mehrere Tier an
         * reinpacken können, die nicht unbengit Tier sein müssen, es kannt Elefeante Sein, denn jedes Tier , den wir wissen
         * hat die Methode macheDichBewerkbar, die wir gar nicht hier implementieren haben,
         *
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
                 * Wir müssen die Klasse nicht Wirklick, ofizzile irgendwie ,
                 * deklarieren als Klasse , also  wir müssen nicht sagen
                 * das esin Hun , das ist ein elefant ,oder etwas was auch immer
                 *
                 * wir können einfach ein Tier erstellen, um es zwar mit eine Anoyme innere Klasse
                 * hier müssen wir auf jeden fall müssen wir den Methode machedichbewerkbart
                 * überschreiben implementieren werden, also die IDe bemerkt das Tier
                 * ein Abstracte Klasse ist , und in Ein  Abstracte klasse wenn sie instatieren wird
                 * muss immer jeder abstracte Methode implementiert Werden. dh wenn wir in Tier
                 * mehrere Abstracte Methoden hätten dann müssen wir die implementieren
                 *
                 *
                 */

                /**
                 * wir haben ein ANONYME INNERE KLASSE ERSTELLT
                 */
                System.out.println("miua");
            }
        });

        for (int i=0; i <tiere.size();i++)
        {
            /**
             * ich schreibe hier, an der Stelle I mache dich bewerkbart
             */
            tiere.get(i).macheDichBewerbar();
        }


    }
}
