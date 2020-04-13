package com.bhs.Main;


import com.bhs.Mapper.NumberConverter;
import com.bhs.Mapper.RomanToNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sample Tool that convert roman numbers to arabic number and inverse
 * Current Language ist it German
 * @TODO Current range of number are 100 , be ,ay to increase this range until 1000
 * <pre>
 *     convertRomanToArabic(x) or covertArabicToRoman(x)
  * </pre>
 * @author JefeMaestro
 * @param x a string value that can be arabic number[0-9] or a valid Roman number [IVXLDM]
 *
 * */
public class main {

    public static void main(String[] args) {

        String inputStr = "";
        boolean endProgram = false;

        /**
         * Menu Console
         */
        do {

            System.out.println("Bitte Geben Sie ein RomanischeNummer(Max C) oder ein Number bis 100");

            inputStr = readInput();

            /// will be check that the Imput values are RomanNumber
            if (inputStr.matches("^[IVXLDM]+$")){
                convertRomanToArabic(inputStr);
            // will be check that the numbers has the correct format
            }else if (inputStr.matches("^[0-9]+$")){
                convertArabicToRoman(inputStr);
            // will be check that another options haven the correct format
            }else if (inputStr.matches("q.*|quit|e.*|exit")){
                System.out.println("Program wird beendet...");
                endProgram = true;
            }else{
                System.out.println("Ungültige Eingabe ,es würde:  " +inputStr+ " eingegeben , versuchen Sie es noch mal.");
            }

        }while (!endProgram);

    }


    /***
     * Convert the checked arabic number into a roman number
     * @param arabicNumber validated number with the correct arabic format
     */
    private static void convertArabicToRoman(String arabicNumber) {
        int number;
        number =  Integer.valueOf(arabicNumber);
        if ((number < 1 || number <= 100)){

            System.out.println("Arabische Nummer eingegeben");
            System.out.println(number + " Romanische Nummer wäre es -> " + NumberConverter.convertToRomanNumber(number));
        }
    }

    /***
     * Convert the checked romanNumber into a arabic number
     * @param romanNumber string with the correct roman format
     */
    private static void convertRomanToArabic(String romanNumber) {
        String roman;
        roman = romanNumber;
        System.out.println("Romanische Character eingegeben");
        System.out.println(roman + " Arabische Nummer wäre es -> "+ NumberConverter.convertToArabicNumber(roman));
    }

    /**
     * Read the input text from a buffering character to provide the efficient read of the character using
     * @see  BufferedReader class in this case allow us to red a clomplete comand line
     * @return return  a String without leading and trailing white spaces
     */
    private static String readInput() {

        String inputString = "";
        try {
         // we use try catch then method readLine uses throws IO exception and we need to catch the IOException
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputString = br.readLine().toString().trim();
        }catch (IOException e){
            System.out.printf("Folgende Fehler bei Einlesen wurde passiert (Details auf English) : {0} ",e.getMessage());
        }
        return inputString;
    }


}
