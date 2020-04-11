import java.util.ArrayList;

/**
 * Created by JefeMaestro on 13.05.2017.
 *  /**
 * In diesem Tutorial möchte ich den super noch mal genau winden, also zusätlich
 * von leztes Video und der Rekursion Dabei
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

        System.out.println("<----Dinamysche Bindung und Rekursion----->");

        // wir erstellent ein Elefante als Tier
        Tier tier = new Elefant();
        // wir rufen diese Elefant und diese Methode dosomething
        /**
         * wir haben hier implicit ein Elefant in dieser Tier drim
         * Methoiden sind Dynamisch gebunden dass heiss wir rufen soSomethign Methode von unsere Elefant auf
         * Der Elefant hat dies Methode , als erste geben wir Blubb aus  bis i null ist
         * was wir sehen  ins der Methoden von Elefenat
         */
        tier.doSomething(3);





    }
}
