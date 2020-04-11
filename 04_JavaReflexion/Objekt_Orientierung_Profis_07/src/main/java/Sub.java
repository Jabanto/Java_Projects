/**
 * Created by JefeMaestro on 25.05.2017.
/**
 * Im diesem Tutorial einige interessante und Wichtige Techniken namens Initializer
 * als Alternative und Erwieterung der Konstruktoren
 * was passiert wenn man Initializer bei Vererbung einsetzt. Folgmir auf
 */
public class Sub  extends Super{

    int i = 5;
    /*
    Diese Static Initializer wir immer ausgefhürt und nur eimal , und ohne
    eine Inztant von Klasse Sub machen,
    kommt bei Erste bei System immer aufgeruft also  braucht keine Klasse
    denn braucht keine

     */
    static {
        System.out.println("Sub static Initializer");
    }

    // Intanzt initalizer
    // Diese Wird von Jeder Intanz der Klasse wir vojher als ganz normale Konstruktor aufgeruft
    // obwohl er Parameter hat oder nicht

    {
        System.out.println("Subklasse Intanzen initializer");
    }

    /**
     * ganz normal Konstruktor  wir d einfach hier sub Konstruktor ausgegeben
     */
    public Sub() {

        super();
        System.out.println("Subklasse Constructor");
    }

    public Sub(int i){

        // hier rufen wir den Kontructro mit Parametter von der SuperKlasse auf

        // wenn wir ein Anweisung voher als super() schreiben bekommen ein Fehler den wird immer zuerst aufgeruft
        //System.out.println("Sub Contructor");
        super(i);
        System.out.println("Subklasse Contructor with param");
    }

    public static void main(String[] args) {

        /*
        1. Zuerst werden Super Intalizer aufgeruft danach Static initilizer vom Sub
        2. Dann werden die Initilizieron von Main aufgeruft dass heid Sub() und Sub(1)
        3. also Super Initializer und Super Initializer werden zuerst aufgeruft
        4. dann Initilizer von Sub kommen dram
        5. bei die zweite Object sind die Super Initilizer und Super Konsructor ncchmal dramm
        6. aber hier wird nicht den Normal Konstruktor aufgeruft sonder der Konstructor mit Feld
        von der Subklasse
         */
        new Sub();
        new Sub(1);
    }

    public void foo(){
        System.out.println("foo");
    }

}
