package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Util.CurrentDate;
import com.bhs.rs.pruefungen.Views.ViewTools;


import java.util.Random;

/**
 * Created by JAbanto on 17.01.2018.
 */
public class Winter2013_GA1_H3_Report extends Aufgabe {

    private Integer gesNetto ;
    private Integer gesProv;
    private Integer minNetto;
    private Integer minNr;
    private AufgabenContext aufgabenContext;

    public Winter2013_GA1_H3_Report(String context){
        this.aufgabenContext = new AufgabenContext(context);
    }


    @Override
    public void execute() {

        this.gesNetto = null;
        this.gesProv = null;
        this.minNetto = null;
        this.minNr = null;
        aufgabenContext.getBeschreibung();
        aufgabenContext.doLoop();
        initAufgabe();

    }

    private void initAufgabe() {

        minNetto = 0;
        minNr = 0;
        gesNetto=0;
        gesProv=0;
        String[][] tableVKA;
        tableVKA = generateVKATabelle();
        printVKAListe(tableVKA);
        ViewTools.outputHeader("Report Erstellung");
        int iterator = 0;
        while (iterator < tableVKA.length) {
            int verNetto = 0;
            int vertProv = 0;
            String vetreterAlt = tableVKA[iterator][0];
            Vetreter vetreter = getAgentData(tableVKA[iterator][0]);
            printAgentDate(vetreter);
            while (iterator < tableVKA.length && vetreterAlt.equals(tableVKA[iterator][0])) {
                int kundeNetto = 0;
                int kunkProv = 0;
                String kundeAlt = tableVKA[iterator][1];
                Kunden kunden = getCustomerData(tableVKA[iterator][1]);
                printCustomerData(kunden);
                ViewTools.output("Auftragsnummer / Datun / Nettounsatz / ProvisionSatz / Provision");

                    while (iterator < tableVKA.length && kundeAlt.equals(tableVKA[iterator][1])) {
                        Auftrag auftrag = getOrderData(tableVKA[iterator][2]);
                        printOrderData(auftrag);
                        kundeNetto += auftrag.getNettoUnsatz();
                        kunkProv += auftrag.getNettoUnsatz() * auftrag.getProvisionSatz() / 100;
                        iterator += 1;
                    }// Ende while
                    printSum("Summe:                        ", kundeNetto, kunkProv);
                    ViewTools.newLine();

                    verNetto += kundeNetto;
                    vertProv += kunkProv;
                    if (verNetto > minNetto) {
                        minNetto = verNetto;
                        minNr = Integer.parseInt(vetreter.vetreterNummer);
                    }
                }//Ende while 2
                printSum("Summe Vetreter                 ", verNetto, vertProv);
                gesNetto += verNetto;
                gesProv += vertProv;
            }//Ende While 1
            printSum("Summe Gesammt", gesNetto, gesProv);
    }

    /**
     * Print sume of Örpvsion and Netto
     * @param summe summe of Values
     * @param kundeNetto netto values
     * @param kunkProv kunden provison
     */
    private void printSum(String summe, int kundeNetto, int kunkProv) {
        ViewTools.output(summe + kundeNetto+ "  /           /  " + kunkProv);
    }

    /**
     * print Auftrag Information
     * @param auftrag auftrag of the customer
     */
    private void printOrderData(Auftrag auftrag) {

        ViewTools.output(auftrag.auftragsNummer + "      / " + auftrag.datum + " /     " + auftrag.nettoUnsatz + "   /     " + auftrag.provisionSatz + "     / " + auftrag.provision );
    }

    /**
     * Generate Autrag values
     * @param s
     * @return
     */
    private Auftrag getOrderData(String s) {

        Auftrag auftrag = new Auftrag();
        auftrag.auftragsNummer = s;
        auftrag.datum = CurrentDate.getCurrentDateFormatGerman();
        auftrag.nettoUnsatz = ranInt(450,1500);
        auftrag.provisionSatz= ranInt(3,10);
        auftrag.provision = ranInt(34,324);

        return auftrag;
    }


    /**
     *
     * Print custommer information
     * @param s customer number
     */
    private void printCustomerData(Kunden k) {
        ViewTools.output("the client " + k.name + " and number" + k.kundennummer +" from "+k.platz);
    }

    /**
     * Create and return Kunden Inforamtion
     * @param s kunden number
     * @return kunden object
     */
    private Kunden getCustomerData(String s) {

        Kunden kunden = new Kunden();

        if (s.equals("22333")){
            kunden.kundennummer = s;
            kunden.name = "Leonardo Davinci";
            kunden.platz = "Italy";
        }
        if(s.equals("22334")){
            kunden.kundennummer = s;
            kunden.name = "Chistofolo Columbus";
            kunden.platz = "Spain";
        }
        if(s.equals("22334")){
            kunden.kundennummer = s;
            kunden.name = "Magallanes";
            kunden.platz = "Portugal";
        }
        if(s.equals("22335")){
            kunden.kundennummer = s;
            kunden.name = "Marco Polo";
            kunden.platz = "Italy";
        }
        if(s.equals("22336")){
            kunden.kundennummer = s;
            kunden.name = "Tupac Amaru II";
            kunden.platz = "Inca Empire";
        }

        return kunden;
    }

    /**
     * to print information about agent
     * @param vetreter agent
     */
    private void printAgentDate(Vetreter vetreter) {
        ViewTools.output("Vetreter name: " + vetreter.vetreterName + " " +vetreter.vetreterNummer);
    }

    /**
     * return information about Agent
     * @param s as a number f the agent
     * @return agent
     */
    private Vetreter getAgentData(String s) {

        Vetreter vetreter = new Vetreter();
        if (s.equals("4771")){

            vetreter.vetreterName = "Maximilian Jorge";
            vetreter.vetreterNummer = s;
        }

        if (s.equals("4772")){

            vetreter.vetreterName = "Jordan Abanto";
            vetreter.vetreterNummer = s;
        }

        if (s.equals("4773")){
            vetreter.vetreterName = "Luis Perlll";
            vetreter.vetreterNummer = s;
        }

        return vetreter;
    }

    /**
     * Creation of the Table
     * @return VKA table
     */
    private String[][] generateVKATabelle() {

        String[][] table = new String[12][3];
        for (int row = 0; row < table.length; row++){

            for (int colum = 0; colum < table[row].length; colum++){

                generateSustitute(table, row, colum);
                if (table[row][colum].equals("4771") ){
                    generateValues(table, row);
                }
                if (table[row][colum].equals("4772")  ){
                    generateValues(table,row);
                }
                if (table[row][colum].equals("4773") ){
                   generateValues(table,row);
                }

            }
        }

        return table;
    }

    /**
     * Generate Values to sustitute
     * @param table VKa Table
     * @param row row number
     * @param colum columm number
     */
    private void generateSustitute(String[][] table, int row, int colum) {

        if (colum == 0 && row <= 3 ){
            table[row][colum] = "4771";
        }
        if (colum == 0 && row >3 && row <=7){
            table[row][colum] = "4772";
        }
        if (colum == 0 && row > 7){
            table[row][colum] = "4773";
        }
    }

    /**
     * Create random Values to the Report table
     * @param table where the values will be added
     * @param row number of the table row
     */
    private void generateValues(String[][] table, int row) {
        int kundenummer = ranInt(22333,22336);
        table[row][1] = String.valueOf(kundenummer);
        int auftragnummer = ranInt(33343,35777);
        table[row][2] = String.valueOf(auftragnummer);
    }


    /**
     * Method to create ramdom values of Weight in a range of (min, max)
     * @param min min value of Range
     * @param max max value to create
     * @return a ramdom number
     */
    private static int ranInt(int min, int max){

        Random generateNummer = new Random();
        int randNumber = generateNummer.nextInt((max-min)+1)+min;
        return randNumber;

    }

    private void printVKAListe(String[][] vkaTabelle) {

            System.out.println("Vetreternummer  Kunnnummer  Auftragsnummer");
            for(int row=0;row<vkaTabelle.length;row++){
                System.out.println("     "+vkaTabelle[row][0]+"    /    " + vkaTabelle[row][1] + "    /    " + vkaTabelle[row][2]);
            }


    }


    /**
     * Inner Class to create a report information
     */
    private class Vetreter {


        protected String vetreterNummer ;
        protected String vetreterName;

        public Vetreter(){}

        public Vetreter(String vetreterName, String vetreterNummer){

            this.vetreterName = vetreterName;
            this.vetreterNummer = vetreterNummer;
        }

    }

    private class Kunden {

        protected String kundennummer;
        protected String name;
        protected String platz;

        public Kunden(){}

        public Kunden(String nummer, String name, String platz){

            this.kundennummer = nummer;
            this.name = name;
            this.platz = platz;

        }

    }

    private class Auftrag {

        protected String auftragsNummer;
        protected String datum;
        protected double nettoUnsatz;
        protected int provisionSatz;
        protected double provision;

        public double getNettoUnsatz() {
            return nettoUnsatz;
        }

        public int getProvisionSatz() {
            return provisionSatz;
        }

    }
}
