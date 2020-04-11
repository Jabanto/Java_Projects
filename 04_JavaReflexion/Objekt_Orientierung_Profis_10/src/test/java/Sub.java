import com.sun.org.apache.bcel.internal.generic.NEW;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by JefeMaestro on 25.05.2017.
 */
public class Sub extends Super {

    /**
     *  ich wollte ihnen zeigen , wir euch einge Sachen, die ihr bei Überladugn von
     *  Methoden immer im Kopf behalten sollten
     * @param args
     */

    public void f(Super s){

        System.out.println("Super " + s);
        //´tut einfach gar nicht
    }
    // dan ein Überladung


    public static void main(String[] args) {

        // 1. wen ich diese Funtkion aufrufe
        // dann wenn wir ein Parameter wird die richtige Funktion ausgeführt

        // 2. dann was passiert ein Sub addieren dann wir die richtige Konstrukto mit Parameter
        // aufgeruft und wenn har nicht geben wird der normal Konstruktor aufgeruft

        // Egal was für Objekte wir haben
        // es wird immer von unten nach Oben Objekte gesucht und aufgeruft
        new Sub().f(new  Sub());

        /**
         * 3. kann ich naturlich auch sagen , diese Funktion wird veerbt und die andere Funktion#
         * schreibe ich noch mal reim, dann werden ich noch der richtige funktion aufrufen
         *
         * 4. kann auch ein Super verwenden, diese Super reinpacken diese Super ist die ober Klasse
         * von der Sub .
         *
         *
         *
         *
         */

    }
}
