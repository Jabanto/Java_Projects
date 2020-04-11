import javax.print.attribute.standard.PrinterURI;

/**
 * Created by JAbanto on 13.06.2017.
 */
public class Gen<T extends Super & Super2> {

/**
 * dass heiß , wenn wir uns hier ein Gen anlegen wollen und rufen wir der Klasse diese soll definiert sein also sub kannman nicht, extens Super hier funktioniert wie Interfaces also jetz können wir nur ein 'Super oder Super2 reimpacken wenn wir ein Gen erstellen wollen.
 *
 *
 *
 * wir wollen die Methode aufrufen können von sub
 *
 *
 *
 */


    public T value;

// das ruft erst mal aus ,
    public void foofoo(){

        System.out.println("Genn::foo");
        //hier wissen wir nicht was für ein klassen und bekommnt Fehler sollen wir definieren ein typ von T ,
        // wir könne  t exdens dann können wir die Methoden von Super aufrufen
        value.foo();

        // können wir ein speziel Typ eingeben könnten
        value.bar();

    }

    // was machen damt wir supoer o Sub aufrufen können, wir schreiben einfach reim , extems ben Gen klasse Definition
    // funktioniert wie interfaces


}
