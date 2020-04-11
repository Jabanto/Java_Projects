package com.bhs.Main;


import com.bhs.Mapper.NumberToRoman;
import com.bhs.Mapper.RomanToNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JAbanto on 05.10.2017.
 */
public class main {

    public static void main(String[] args) throws IOException {

        String input;
        boolean endProgram = false;

        do {

            System.out.println("Bitte Geben Sie ein RomanischeNummer(Max C) oder ein Number bis 100");
            input = readImput();

            if (input.matches("^[IVXLDM]+$")){
                convertRomanToArabic(input);
            }else if (input.matches("^[0-9]+$")){
                convertArabicToRoman(input);
            }else if (input.matches("q.*|quit|e.*|exit")){
                System.out.println("Program wird beendet...");
                endProgram = true;
            }else{
                System.out.println("Ungültige Eingabe '"+input+"'.");
            }

        }while (!endProgram);

    }

    private static void convertArabicToRoman(String imput) {
        int number;
        number =  Integer.valueOf(imput);
        if ((number < 1 || number < 100)){

            System.out.println("Romasiche Character eingegeben");
            System.out.println(number + " romanische Nummer -> " + NumberToRoman.convertToRomanNumber(number));
        }
    }

    private static void convertRomanToArabic(String imput) {
        String roman;
        roman = imput;
        System.out.println("Romasiche Character eingegeben");
        System.out.println(roman + " arabische Nummer --> "+ RomanToNumber.convertToArabicNumber(roman));
    }

    private static String readImput() throws IOException{

        String enter = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        enter = br.readLine().toString().trim();
        return enter;
    }


}
