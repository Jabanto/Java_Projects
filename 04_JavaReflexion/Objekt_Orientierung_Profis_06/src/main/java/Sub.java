/**
 * Created by JefeMaestro on 25.05.2017.
 */


/**
 * Im diesem Tutorial einige interessante und Wichtige Techniken namens Initializer
 * als Alternative und Erwieterung der Konstruktoren
 */
public class Sub {

    {
        // Also der intializer muss imeer nach den Variable onder Atribut
        /**
         * deklariert werden denn er immer zuert auferuft wird und wenn keine
         * Varialbe noch nciht erstellt ist dann bekommen ein Fehler
         * aber wenn  wir zuweisen diese variable durch ein MEthode Foo
         * dann ja denn wirdzuerst den Methode foo() aufgeruft  und dann
         * obwohl er ruft die Variable i er sagt ok , diese Variable hat wert null
         * und danach  wird die Variable i mit WErt 5 erzeugen
         * und normalaweise in Java ein integer is eine nullablke Variable
         *
         */
        System.out.println("Intanzen initializer");
        foo();
    }

    int i = 5;

    /**
     * ganz normal Konstruktor  wir d einfach hier sub Konstruktor ausgegeben
     */
    public Sub() {

        System.out.println("Sub Constructor");
    }

    /*
    Diese Static Initializer wir immer ausgefhürt und nur eimal , und ohne
    eine Inztant von Klasse Sub machen,
    kommt bei Erste bei System immer aufgeruft also  braucht keine Klasse
    denn braucht keine

     */
    static {
        System.out.println("static Initializer");
    }

    // Intanzt initalizer
    // Diese Wird von Jeder Intanz der Klasse wir vojher als ganz normale Konstruktor aufgeruft
    // obwohl er Parameter hat oder nicht
    {
        System.out.println("Instance Initializer");

    }


    public static void main(String[] args) {

        new Sub();
        new Sub();


    }

    public void foo(){
        System.out.println("foo");
        System.out.println(i);
    }


}
