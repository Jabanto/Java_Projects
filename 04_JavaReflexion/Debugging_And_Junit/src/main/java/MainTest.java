import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JefeMaestro on 13.05.2017.
 */
public class MainTest {


    @Test
    public void test(){

       HelperClass t = new HelperClass();

        /**
         * Dann sagen  wir hier was wir gerne als Bedinnung hätten,
         * was das eingentlich raus kommnen sollte  , was logischeweiser ist hier 5
         */
        assertTrue( "i ungleich 5", t.i == 5 );
        /**
         * enstpricht bwz zuerst was wir erwarten und was tasachlich raus
         * wenn das nicht wahr ist dan den Test  fehlt
         */
        t.endless();

        assertEquals("h not 4","4",t.j);

    }

    /**
     * wie gessagt oft mals nimmt man für jeder Klasse eine eingenen Testklasse und
     * für jeder Methode ein eigene TestMethode und dann werden in dieser TestMethode
     * werden sachen so Setup() oft  gerufen , wo man auf welche  Variable aufruft und werden
     * vorher inwelcher Methoden aufrufen damit mit den Zustand quasi erreicht wird der man testen möchten
     *
     * Versuchen da irgenwie für jeder Zustand möglichst ein Test zu schreiben
     * das kann sehr aufwendigt , und sehr sehr viel w
     * werden aber lohnt sicht auf jeden Fall und wenn wir ein Error finde dann fix ihn.
     *
     */



}