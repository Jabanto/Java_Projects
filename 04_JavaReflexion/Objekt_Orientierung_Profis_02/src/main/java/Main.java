import org.omg.CORBA.TIMEOUT;

import java.util.ArrayList;

/**
 * Created by JefeMaestro on 13.05.2017.
 */
public class Main {

    public static void main(String[] args) {


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

        /**
         * and jetzt wir DEn WErt Von Hund beine 5 sein
         * der compiler ssagt hier ok, das ein Hund denn wir wir haben es gecastet
         * und wir holen den Anzahl in beine
         */
        System.out.println(((Hund)tiere.get(0)).beine);


        for (int i=0; i <tiere.size();i++)
        {
            // tiere.get(i).macheDichBewerbar();

            /**
             * das heiis wenn ich die beine aufrufe
             * hier weis nur das ein Tier ist deshalb git 1 als Ergebnis
             * aber hier ist die Verbindung ist Statis bei Atributen und holen
             * wir den Anzahl von Tier beine obwhol die Liste Hund und Elefant hat
             *
             * was man dagegen tun kann ist folgendes wenn wir sicher sind,
             * dass wir z.B auf Beine Hund zugreifen wollen
             * dann screiben Wir ein Metode getBeide() bei {@link Tier}
             * aber trozdem der Compiler ausgibt Anzahl von Tier then
             * er automatisch this. verwent. also sollen wir
             * this auch in the methode getBeine von Hunde und Elefent verwenden
             * um endlich Den Anzahl von dem Unterklasse (Elefant und Hund)
             *
             * NATURLICH Müssen wir den Methode getbeine verwendent , wenn wir
             * .beine schreiben dann werden wir den Anzahl von Klasse TIer bekommen
             *
             */

            System.out.println(tiere.get(i).getBeine());
        }

        /**
         * Was wir jezt nicht villeicht wusste ist das , diese Atribut hier beine von
         * der Klasse {@Link Hund} oder andere überschreiben kann
         *
         * wir haben eigentlich 5 bei Elfent 4 für hund und 1 für Tier
         * und wenn wir das ausgeben dann bekommen 1
         *
         * umd Das Liegt daran
         * Atributen sind statisch verwunden und Methode sin dinamish Verwunden
         * d.h
         *
         */


    }
}
