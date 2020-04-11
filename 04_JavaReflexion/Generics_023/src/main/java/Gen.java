/**
 * Created by JAbanto on 13.06.2017.
 * Hier werden wir die grundlegenden Funktionen von Genereics in Javaj
 *
 */


import java.util.ArrayList;

/**
 * das is unsere Generics Klasse und da sieht man ebem daran dass wir hier diese Spitzklammer auf T und Spitzklammer zu haben, diese t kann irgend eine Klassse seinj, die wir ausuchen wollen. wir kennen schon von ArrayListe
 * @param <T> kann ein String sein , diesen kann frei ausuchen
 */
public class Gen<T extends String> {

    // diese Klasse dass wir in T definieren können wir quasi benutzen wie ein KlasseTyp
    private T value;
    private T next;
    private T before;

    // Können wir noch mehr Variale benutzen

    public T gitMirT(){

        // wir können unsere T value casten aber sollen vorher wissen was für ein Datentyp ist


        return value;
    }

}
