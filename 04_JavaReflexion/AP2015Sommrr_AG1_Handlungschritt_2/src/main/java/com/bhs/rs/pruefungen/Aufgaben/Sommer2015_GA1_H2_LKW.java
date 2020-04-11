package com.bhs.rs.pruefungen.Aufgaben;

import com.bhs.rs.pruefungen.Model.Aufgabe;
import com.bhs.rs.pruefungen.Parsing.XML_work;
import com.bhs.rs.pruefungen.Util.AufgabenContext;
import com.bhs.rs.pruefungen.Views.ViewTools;
import java.util.Random;
import java.util.function.ToDoubleBiFunction;

/**
 * Created by JAbanto on 15.01.2018.
 *
 *
 */

public class Sommer2015_GA1_H2_LKW extends Aufgabe {

    /**
     * Array that will contains , weight, number of Lkw and palet number
     */
    private int[][] ladungsliste;
    private AufgabenContext aufgabenContext;

    public Sommer2015_GA1_H2_LKW(String context) {
        this.aufgabenContext=  new AufgabenContext(context);
    }

    @Override
    public void execute(){

        ladungsliste = null;
        aufgabenContext.getBeschreibung();
        aufgabenContext.doLoop();
        initAufgabe();

    }

    private void initAufgabe() {

        int nutlast_kg = Integer.parseInt(ViewTools.readInput("\"Please introduce max charge in kg ,\"").trim());
        if(nutlast_kg < 100){
            nutlast_kg = Integer.parseInt(ViewTools.readInput("\"Please tip a value great than 100 Kg \""));
        }
        int maxAnzahl_Palette = Integer.parseInt(ViewTools.readInput("\"Please introduce max number of Palettes,\"").trim());
        ladungsliste = generateArray(maxAnzahl_Palette,nutlast_kg);
        erstelleLadungsListe(nutlast_kg,maxAnzahl_Palette, ladungsliste);
        logListe(ladungsliste);

    }

    /**
     * Main Method to charge "lwk" with the defined number of pallets and maximal weight
     * @param nutzlast_Kg max Weiht of charge
     * @param maxAnzahl_Palette max number of paletes
     * @param ladungsliste palets list
     */
    private void erstelleLadungsListe(int nutzlast_Kg,int maxAnzahl_Palette,int[][] ladungsliste){


       int lkw_number = 1;
       boolean lkw_Voll = false;
        int totalWeigth = 0 ;

       while (!lkw_Voll && lkw_number <= 10){

           lkw_Voll = true;

           int numberOfPalets = 0;

           for (int row = 0; row < ladungsliste.length; row++ ){
               int currentCharge = 0;
               currentCharge = totalWeigth + ladungsliste[row][0];
               if (currentCharge <= nutzlast_Kg && numberOfPalets < maxAnzahl_Palette && ladungsliste[row][1]==0){

                   totalWeigth += ladungsliste[row][0];
                   numberOfPalets += 1;
                   ladungsliste[row][1] = lkw_number;
                   lkw_Voll = false;
               }
           }
           lkw_number += 1;
       }

        ViewTools.output("Lkw " + lkw_number +  " ist complete charged with "+  String.valueOf(maxAnzahl_Palette) +" numbers of palets");
    }

    /**
     * To Print an Array liste as a table
     * @param liste list to print
     */
    private void logListe(int[][] liste){
        System.out.println("Gewicht  LKW  NR");
        for(int row=0;row<liste.length;row++){
            System.out.println(liste[row][0]+" / " + liste[row][1] + " / " + liste[row][2]);
        }

    }

    /**
     * Method to generate values for the "ladungslsite" , with the number of palettes and the maximal Weight
     * @param anzahlPalette number of palets
     * @param nuztllast max weigth to charge
     * @return an Array with values
     */
    private int[][] generateArray(int anzahlPalette, int nuztllast){

        int[][] ladungsliste = new int[anzahlPalette][3];

        for (int i = 0; i < ladungsliste.length; i++){

         for (int j = 0 ; j < ladungsliste[i].length;j++){

                int paletteNumber = 27620 ;
                if(j == 0){
                    int gewicht = ranInt(100,nuztllast);
                    ladungsliste[i][j] = gewicht;
                }
                if(j == 1){
                    ladungsliste[i][j] = 0;
                }
                if (j==2){
                    paletteNumber += i;
                    ladungsliste[i][j] = paletteNumber;
                }
            }

        }
        return ladungsliste;
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


}
