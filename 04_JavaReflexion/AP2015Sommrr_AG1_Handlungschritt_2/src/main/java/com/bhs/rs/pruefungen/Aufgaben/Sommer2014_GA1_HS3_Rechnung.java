package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Util.CurrentDate;
import com.bhs.rs.pruefungen.Views.ViewTools;

import java.security.SecureRandom;
import java.time.temporal.ValueRange;
import java.util.Random;

class Rechnung{


    private String rechnungNr;
    private String rechnungDatun;

    public Rechnung(){

        this.rechnungNr = String.valueOf(Math.random());
        this.rechnungDatun = CurrentDate.getDateUtilFormat();

    }

    public String getRechnungNr() {
        return rechnungNr;
    }

    public void setRechnungNr(String rechnungNr) {
        this.rechnungNr = rechnungNr;
    }

    public String getRechnungDatun() {
        return rechnungDatun;
    }

    public void setRechnungDatun(String rechnungDatun) {
        this.rechnungDatun = rechnungDatun;
    }


}
class Artikel {

    private int artikelNr;
    private String Bezeichnung;

    public Artikel(){
        this.artikelNr = 123;
        this.Bezeichnung = "Bezeichnung";
    }

    public int getArtikelNr() {
        return artikelNr;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
}

class Bestellposition{

    private int besttllNr ;
    private int posNr;
    private Artikel  artikel;

    private int einzeilPreis;
    private int menge;

    public Bestellposition(){
        this.einzeilPreis = 22;
        this.menge = 7;
        this.besttllNr = 1;
        this.posNr = 1;
        this.artikel = new Artikel();
    }

    public int getEinzeilPreis() {
        return einzeilPreis;
    }

    public int getMenge() {
        return menge;
    }

    public int getBesttllNr() {
        return besttllNr;
    }

    public void setBesttllNr(int besttllNr) {
        this.besttllNr = besttllNr;
    }

    public int getPosNr() {
        return posNr;
    }

    public void setPosNr(int posNr) {
        this.posNr = posNr;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

}


class Bestellung {

    private int bestellNummern;
    private String bestellDatum;
    private Rechnung rechnung;
    private Bestellposition[] bestellpositions;
    public Bestellung(){
        // TODO: 04.04.2018  ist gut hier methoden aufrufen ?
        this.bestellNummern = new SecureRandom().nextInt(100);
        this.bestellDatum = CurrentDate.getCurrentDateFormatGerman();
        this.rechnung = new Rechnung();
        this.bestellpositions = generateBestellpositions();
    }

    private Bestellposition[] generateBestellpositions (){

        Bestellposition bestellposition = new Bestellposition();
        Bestellposition bestellposition1 = new Bestellposition();
        Bestellposition bestellposition2 = new Bestellposition();
        Bestellposition[] arraybestell = {bestellposition,bestellposition1,bestellposition2};

        return arraybestell;
    }

    public int getBestellNummern() {

        SecureRandom random = new SecureRandom();
        random.nextBytes(new byte[100]);
        this.bestellNummern = random.nextInt();
        random.setSeed(System.currentTimeMillis());
        return bestellNummern;
    }

    public String getBestellDatum() {
        return bestellDatum;
    }

    public Rechnung getRechnung() {
        return rechnung;
    }

    public Bestellposition[] getBestellpositions() {
        return bestellpositions;
    }
}

class Kunde {
    private String kundenr;
    private String kundeName;
    private String kundeStrasse;
    private String kundePLZ;
    private String Ort;
    private Bestellung[] kundeBestellungen;
    // TODO: 04.04.2018 Make a Klass Rabate
    private double rabate;

    public Kunde(){
        // TODO: 04.04.2018 generieren daten für kunden
        this.rabate = 0.2;
        this.kundenr = String.valueOf(new SecureRandom().nextInt(100));
        this.kundeName = "Kunde Name";
        this.kundeStrasse = "Straßename";
        this.kundePLZ = "PLZrandon";
        this.Ort  = "Ort";
        // TODO: 04.04.2018 daten Besetlungen generieren
        this.kundeBestellungen = generateBestellungen();
    }

    public Kunde(String kundenr, String kundeName, String kundeStrasse, String kundePLZ, String ort) {
        this.kundenr = kundenr;
        this.kundeName = kundeName;
        this.kundeStrasse = kundeStrasse;
        this.kundePLZ = kundePLZ;
        this.Ort = ort;
        this.kundeBestellungen = generateBestellungen();
        this.rabate = 0.2;
    }
    // TODO: 04.04.2018 Bestellungen genieren hier is ok?
    /**
     * Bestellungen Kunde generieren
     *
     */
    private Bestellung[] generateBestellungen() {

        Bestellung bestellung = new Bestellung();
        Bestellung bestellung1 = new Bestellung();
        Bestellung bestellung2 = new Bestellung();
        Bestellung[] array  = {bestellung,bestellung1,bestellung2};
        return array;
    }

    /**
     * Region Getter und Setter
     * @return
     */

    public String getKundenr() {
        return kundenr;
    }

    public void setKundenr(String kundenr) {
        this.kundenr = kundenr;
    }

    public String getKundeName() {
        return kundeName;
    }

    public void setKundeName(String kundeName) {
        this.kundeName = kundeName;
    }

    public String getKundeStrasse() {
        return kundeStrasse;
    }

    public void setKundeStrasse(String kundeStrasse) {
        this.kundeStrasse = kundeStrasse;
    }

    public String getKundePLZ() {
        return kundePLZ;
    }

    public void setKundePLZ(String kundePLZ) {
        this.kundePLZ = kundePLZ;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Bestellung[] getKundeBestellung() {
        return kundeBestellungen;
    }

    public void setKundeBestellung(Bestellung[] kundeBestellung) {
        this.kundeBestellungen = kundeBestellung;
    }

    public double getRabate() {
        return rabate;
    }

    public void setRabate(double rabate) {
        this.rabate = rabate;
    }

}

public class Sommer2014_GA1_HS3_Rechnung extends Aufgabe {

    private AufgabenContext aufgabenContext;

    public Sommer2014_GA1_HS3_Rechnung(String context){

        this.aufgabenContext = new AufgabenContext(context);

    }

    @Override
    public void execute() {

        aufgabenContext.getBeschreibung();
        aufgabenContext.doLoop();
        initaufgabe();

    }

    private void initaufgabe() {
         Kunde kunde = new Kunde();
         getRechnungerstellung(kunde);

    }

    private void getRechnungerstellung(Kunde kunde) {

        int gesammt_summe = 0;
        Bestellung[] bestellungen = kunde.getKundeBestellung();
        for (Bestellung bt: bestellungen) {
            int seite = 1;
            int zeile = 1;
            druckeSeitenKofp(seite);
            druckeRechnungKopf(kunde, bt);
            getDruckePositionenKopf();
            Bestellposition[] bestellposition = bt.getBestellpositions();
            for (int i = 0 ; i < bestellposition.length; i++){
                Bestellposition bp = bestellposition[i];
                if (zeile > 20){
                    zeile = 1;
                    seite ++;
                    druckeSeitenKofp(seite);
                    getDruckePositionenKopf();
                }
                getDruckePositionsZeile(bp);
                gesammt_summe += bp.getEinzeilPreis()*bp.getMenge();

            }
            druckeRechnungFuss(kunde, gesammt_summe);
        }
        ViewTools.output("Ergnenis gesammt" + String.valueOf(gesammt_summe));
    }

    private void druckeRechnungFuss(Kunde kunde, int gesammt_summe) {

        double preisfinal = 0.0;
        ViewTools.separator("----Rechnungs fusss---");
        ViewTools.output("Summe : " + gesammt_summe);
        ViewTools.output(String.valueOf("Rabbate :"+kunde.getRabate()));
        double preismitRabat = gesammt_summe - gesammt_summe* kunde.getRabate();
        ViewTools.output("Preis mit Rabbatt: " + String.valueOf(preismitRabat));
        ViewTools.output("Steuer: 15%");
        preisfinal +=  preismitRabat + preismitRabat*0.15;
        ViewTools.output("Final Preis :"+String.valueOf(preisfinal));
    }

    private void getDruckePositionsZeile(Bestellposition bp) {
         ViewTools.output(String.valueOf(bp.getPosNr())+ "--" +
                 String.valueOf(bp.getArtikel().getArtikelNr())+ "--" +
                 bp.getArtikel().getBezeichnung()+ "--" +
                 String.valueOf(bp.getEinzeilPreis())+ "--" +
                 String.valueOf(bp.getMenge()) + "--" +
                 String.valueOf(bp.getMenge()*bp.getEinzeilPreis()));
    }

    private void getDruckePositionenKopf() {
        ViewTools.output("Position,   ArtikelNr, Bezeichnung , einzelPreis , Menge , Preis");
        ViewTools.separator();
    }

    private void druckeRechnungKopf(Kunde kunde, Bestellung bt) {
        ViewTools.separator();
        ViewTools.output("Name"+kunde.getKundeName());
        ViewTools.output("Nummer"+String.valueOf(bt.getBestellNummern()));
        ViewTools.output("Datum"+bt.getBestellDatum());
    }

    private void druckeSeitenKofp(int seite) {
        ViewTools.output("Seite Nummer : " +String.valueOf(seite));
    }
}
