/**
 * Created by JAbanto on 13.06.2017.
 */
public class Generics {

    /**
     * ich möchte ein paar speziale Sache zum Generics zeigen
     * wenn man eine bestimmte Beschkrenkung haben möchte zum Beispielt also zum Beispielt
     * eine Methode ein obere KLasse aufrufe, und das geht mit Generics
     *
     * @param args
     */

    public static void main(String[] args) {

        // und jetz können wir ein Sub oder super reimpackenund kein String mehn

        Gen<Sub> superGen = new Gen<Sub>();

        superGen.value = new Sub();

        superGen.foofoo();


    }
}
