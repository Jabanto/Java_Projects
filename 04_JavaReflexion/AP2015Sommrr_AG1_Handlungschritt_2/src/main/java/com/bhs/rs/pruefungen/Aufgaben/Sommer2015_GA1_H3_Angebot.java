package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Parsing.XML_work;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Util.CurrentDate;
import com.bhs.rs.pruefungen.Views.ViewTools;

import java.io.PrintWriter;

class Angebot {
    protected int angebotsNummer ;
    protected String kundennummer ;
    protected double preisOhneRabat;
    protected double preisMitRabat;
    protected double rabattProzentsatz;
    protected Route route;

    protected Angebot(){}

    protected Angebot(int angebotsNummer,String kundennummer, double preisOhneRabat, double preisMitRabat,double rabattProzentsatz, Route route){

        this.angebotsNummer = angebotsNummer;
        this.kundennummer = kundennummer;
        this.preisOhneRabat = preisOhneRabat;
        this.preisMitRabat = preisMitRabat;
        this.rabattProzentsatz = rabattProzentsatz;
        this.route = route;

    }


}
class Route {

    private Strecke[] strecken ;
    public Route(){

        this.strecken = new Strecke[3];
        Strecke number1 = new Strecke("b","L,",1.10);
        Strecke number2 = new Strecke("l", "f",1.50);
        Strecke number3 = new Strecke("f","k",1.70);

        strecken[0] = number1;
        strecken[1] = number2;
        strecken[2] = number3;


    }

    protected Strecke[] GetStrecken (){

        return strecken;
    }

}
class Strecke {

    protected String start;
    protected String ziel;
    protected double Preis;

    public Strecke(){}

    public Strecke(String start, String ziel, double preis) {
        this.start = start;
        this.ziel = ziel;
        Preis = preis;
    }

}

/**
 * Create an Offer with rabat and Offer number
 */
 public class Sommer2015_GA1_H3_Angebot extends Aufgabe {

     private String kundennummer;
     private String start_ort;
     private String ziel_ort;
     private String versandTermin;
     private Double gewicht;
     private Angebot angebot;
     private AufgabenContext aufgabeContext;

     public Sommer2015_GA1_H3_Angebot(String context){
         this.aufgabeContext = new AufgabenContext(context);
     }


    @Override
    public void execute() {

        kundennummer = null;
        start_ort = null;
        ziel_ort = null;
        gewicht = null;
        versandTermin = null;
        angebot = null;
        aufgabeContext.getBeschreibung();
        aufgabeContext.doLoop();
        initAufgabe();

    }

    private void initAufgabe() {

        kundennummer = "10101987";
        start_ort = "B";
        ziel_ort = "K";
        gewicht = 0.0;
        versandTermin = CurrentDate.getDateSQLFormat();
        angebot = new Angebot();
        angebot = erstelleAngebot(kundennummer,start_ort,ziel_ort,gewicht,versandTermin);
        ViewTools.outputHeader("Offer number " + angebot.angebotsNummer);
        ViewTools.output("The Client with number "+angebot.kundennummer);
        ViewTools.output( "have an Offer with initial price of "+ angebot.preisOhneRabat + " and now have a new price of " + angebot.preisMitRabat);
        ViewTools.output( "This price it is for the next Route :" + start_ort + ziel_ort +" (B=Berlin)-(K=Köln)");
    }

    /**
     *
     * @param kundennummer
     * @param start_ort
     * @param ziel_ort
     * @param gewicht
     * @param versanTermin
     */
    private Angebot erstelleAngebot(String kundennummer, String start_ort, String ziel_ort, double gewicht, String versanTermin) {

        Angebot angebot = new Angebot();
        Route[] route = getRouten(start_ort,ziel_ort,versanTermin);
        double minRoutePreis = 0.00;
        int indexguenstigsteRoute = 0;

        for (int row = 0;  row <= route.length-1 ; row++){

            double routenPreis = 0.00;
            for (int colum = 0; colum < route[row].GetStrecken().length;colum++){

                routenPreis += route[row].GetStrecken()[colum].Preis;
            }
            if (minRoutePreis == 0.00){

                minRoutePreis = routenPreis;
                indexguenstigsteRoute= row;

            }
            else
                if (minRoutePreis > routenPreis){
                    minRoutePreis = routenPreis;
                    indexguenstigsteRoute = row;

                }
        }

        angebot.angebotsNummer = ErzeugeAngebotsnummer();
        angebot.kundennummer = kundennummer;
        angebot.preisOhneRabat = GetPreisOhneRabatt(minRoutePreis,gewicht);
        angebot.rabattProzentsatz = Math.max(GetKundenRabattintProzent(kundennummer), GetGewichtsRabattInProzent(gewicht));

        angebot.preisMitRabat= angebot.preisOhneRabat - ( angebot.preisOhneRabat * angebot.rabattProzentsatz/100);
        angebot.route = route[indexguenstigsteRoute];

        return angebot;

    }

    /**
     *
     * @param gewicht
     * @return
     */
    private int GetGewichtsRabattInProzent(double gewicht) {

        return 2;
    }

    /**
     *
     * @param kundennummer
     * @return
     */
    private int GetKundenRabattintProzent(String kundennummer) {


        return 15;
    }


    /**
     *
     * @param minRoutePreis minimal preis route
     * @param gewicht weigth of charge to transport
     * @return
     */
    private double GetPreisOhneRabatt(double minRoutePreis, double gewicht) {

        return 10.00;
    }

    /**
     *
     * @return a offer number
     * @// TODO: 17.01.2018 generate logik to create a random number
     */
    private int ErzeugeAngebotsnummer() {


        return 10101987;
    }

    /**
     *
     * @param start_ort
     * @param ziel_ort
     * @param versanTermin
     * @return
     */
    private Route[] getRouten(String start_ort, String ziel_ort, String versanTermin) {

        Route[] route =  new Route [3];

        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();

        route[0] = route1;
        route[1] = route2;
        route[2] = route3;

        return route;
    }

}
