/**
 * Created by JefeMaestro on 13.05.2017.
 */
public class Hund extends Tier {


    private int beine = 5 ;

    @Override
    public void macheDichBewerbar() {

        /**
         * wenn ich hier Super aufrufe, dann kan ich hier  auf den Methoden
         * von meine Obererklass  zugreifen, also krigen then Methoden von
         * der Klasse Tier
         * also zugreifen auf alle Atributen und Methoden
         * aber aufpassen nur wenn notig ist
         */
        super.macheDichBewerbar();
        System.out.println("Woff");
    }

    public int getBeine() {
        return this.beine;
    }

    /**
     * wir können nicht nicht diese Methode nicht überschreiben oder
     * ausßenhlab der Klasse nicht adresseiren
     * dass heiß wir könnene nur diese Klasse durch getBeine() aufrufen
     */
    private void lassBeinewachsen(){
        this.beine++;
    }



}
