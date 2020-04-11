import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;


/**
 * Created by JefeMaestro on 28.05.2017.
 * wie man die Laufzeit eine Algorithmuss (lauft) abscchätzt (calcular)
 *
 * wie lange unsere algorithmus lauf // Oder wie lagen braucht den Ganzen
 */
public class Laufzeit {


    //private static final Logger LOGGER = LoggerFactory.getLogger("hola");

    // Anhand diese Eingabe gröse , group erkennen
    // die Laufzeit bleib immer gleich egal qie lange Grösse von der Liste ist
    public void KonstanteLZ(ArrayList<String>  s){

        // beispielt von Kontan
        int x =  1 + 1;
        // dann  muste komplett von die Liste reimlesen
        // das wäre kein Konstanzlaufzeit
        //s.get(s.size()-1);
    }

    public void linearLaufzeit(int[] a){
        // bei Array kann ich direct auf die Object zugreifen ohne Iterator wie bei ArraList
        // weil jedes element soll ich mehr tunn, sowald großer ist die Array wir die Laufzeit mehr dauert
        for (int i=0;i < a.length ; i++){
            a[i] = 5; // ich kann direkte auf die Elemeten zugreifen
            // wenn ein ArryLsite wäre solll ich durch die Liste gehen
        }
    }

    public void quadratischer(ArrayList<String> s) {

        for (int i = 0; i < s.size(); i++) {
            // muss jedes mal bis zu Stelle i object laufen, bis zum Stellen laufen und dann abc setzen
            // und so für jeden Element dass wir addieren
            // für jedes Element von die Liste brauchen wir ein Linearlaufzeit
            // linearen Laufzeit + linear Laufzeit = Quadratischer Laufzeit
            s.set(i, "abc");
        }
    }

    public void lodgarithmischeLaufzeit(ArrayList<String> s){
        /**
         * passiert wenn wir ein Baum in der höhe durchlaufen wollen
         * die komplette höhe diese Baum durchlaufen aber nur einmal
         * ÜBER DAS , WERDEN WIR IN NÄACHSTE kAPITEL REDEN
         */

    }



    public int exponentieleLaufzeit(int i){
        /**
         * wenn ich diese i aufrufen dann gehe wir rein und brechen die funktion einmal
         * 1 kleiner und noch ienmal für zweimal kleiner
         * er versucht durch dieser Rekursiv , bei ein Wert von 100
         * dann wird die folgenden Methoden aufrufen bei 99 und 98
         * und für 99 wird noch mal 98 und 97 noch mal aufgerufen und bei 98 wäre 97 und 96
         *
         */

        // TODO: 13.06.2017 shauen wie log funktionieren

        // LOGGER.info("info von {}",i);

        System.out.println(i);

        return exponentieleLaufzeit(i-1) + exponentieleLaufzeit(i-2);
    }

    public static void main(String[] args) {

        int meinWert = 5;

        Laufzeit neu = new Laufzeit();
        neu.exponentieleLaufzeit(meinWert);

    }
}
