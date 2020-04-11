import java.util.ArrayList;

/**
 * Created by JefeMaestro on 25.05.2017.
 */
public class Super {

    /**
     * wir könne auch final Variable erstellen , final bedeute nicht überchrieben darf
     * also dass heiss er kann nicht in andere Wert zugeweissen  werden
     * in der Klasse kann nur diese FEld nur einmal zugeweisen werdenm in der Konstructor
     * dann ist FeierAbend
     *
     * Beispiele von Final wäre die OBject Integer , diese Klasse kann man nicht extend denn
     * JAva wird explodiert
     */


    /**
     * wir konnen die Ganze Klasse final machen, so dass passier  es folgendes
     * ich nicht von dieser Klasse nicht erbert also keine Subklasse extend
     *
     */


    final int i = 150;
    //diese wird zuerst aufgeruft vor als statis intantz vom Subklasse


    /**
     *  dann haben wir Static Variablen , diese haben keien Variable in Konstruktor aufzurufen
     *  dann BRauchen ein Static initializer oder Static BLock
     */
    static int j ;

    static {
        System.out.println("Super static Initializer");
    }

    {
        System.out.println("Super Intanzen initializer");
        // wenn ich jezt hier object erstelle dann bekommen ich ein null
        foo();

    }

    /**
     * ganz normal Konstruktor  wir d einfach hier sub Konstruktor ausgegeben
     */
    public Super() {

        System.out.println("Super Constructor");
    }

    public Super(int i){
        System.out.println("Super Constr with Para");
    }


    /**
     *  wenn wir diese MEthode Final ist dann wissen dass diese Methoden
     *  in der Intilizer aufgeruft wird, also egal welche object
     *  wird nicht veerbt und kann nicht überschreiben werden.
     */
    private void foo()

    {
        System.out.println("Super foo " + i);
        ArrayList<String>  s = new ArrayList<String>();
        baz(s);
        System.out.println(s.get(0));
    }

    /**
     * wirt habven ein Arraya LKist aus Strings und nnene wir
     * folgendens damit machen wir kreieren eine Arrasy list auy Strings
     * so.und dann rufen baz Auf über s , dann sagen s . get(0)
     * uns geben wir eine Nachricht aus
     * y darf diese Parameter nicht weiter zuweisen
     *
     * @param strings
     */
    public void baz(final ArrayList<String> strings){

        // hier addieren wir ein Wert sons bekommen  wir Fehler
        strings.add("in bazz hinzufügen");
        // weil wir final deklarien haben, nur können einmal diese string zuweisen und bekommen fehler
        // strings = new ArrayList<String>();

    }







}
