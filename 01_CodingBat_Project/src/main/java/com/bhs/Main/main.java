package com.bhs.Main;


import com.bhs.Mapper.NumberToRoman;
import com.bhs.Mapper.RomanToNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sample Tool that convert roman numbers to arabic number and inverse
 * Current Language ist it German
 * @TODO Current range of number are 100
 * <pre>
 *     convertRomanToArabic(x) or covertArabicToRoman(x)
  * </pre>
 * @author JefeMaestro
 * @param x a string value that can be arabic number[0-9] or a valid Roman number [IVXLDM]
 *
 * */
public class main {

    public static void main(String[] args) throws IOException {

        String inputStr = "";
        boolean endProgram = false;

        /**
         * Menu Console
         */
        do {

            System.out.println("Bitte Geben Sie ein RomanischeNummer(Max C) oder ein Number bis 100");
            inputStr = readImput();

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
                System.out.println("Ungültige Eingabe '"+inputStr+"'.");
            }

        }while (!endProgram);

    }


    /***
     * Convert the checked number into a roman number
     * @param arabicNumber validated number with the correct arabic format
     */
    private static void convertArabicToRoman(String arabicNumber) {
        int number;
        number =  Integer.valueOf(arabicNumber);
        if ((number < 1 || number < 100)){

            System.out.println("Romasiche Character eingegeben");
            System.out.println(number + " romanische Nummer -> " + NumberToRoman.convertToRomanNumber(number));
        }
    }

    /***
     * Convert the checked romanNumber into a arabic number
     * @param romanNumber string with the correct roman format
     */
    private static void convertRomanToArabic(String romanNumber) {
        String roman;
        roman = romanNumber;
        System.out.println("Romasiche Character eingegeben");
        System.out.println(roman + " arabische Nummer --> "+ RomanToNumber.convertToArabicNumber(roman));
    }

    /**
     * Read the input on the console
     * @return return  a valid string value
     * @throws IOException handle no expected or null exceptions
     */
    private static String readImput() throws IOException{

        String enter = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        enter = br.readLine().toString().trim();
        return enter;
    }


}
