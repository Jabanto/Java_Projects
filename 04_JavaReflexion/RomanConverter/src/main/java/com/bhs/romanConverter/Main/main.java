package com.bhs.romanConverter.Main;
import com.bhs.romanConverter.Mapper.NumberToRoman;
import com.bhs.romanConverter.Mapper.RomanToNumber;
import com.sun.javafx.scene.layout.region.Margins;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by JAbanto on 05.10.2017.
 */
public class main {

    public static void main(String[] args) throws IOException {

        // TODO: 05.10.2017 just from nummer to roman but any detector and
        // // TODO: 05.10.2017 and conection to reconise and call respective class
        Scanner sc = new Scanner(System.in);
        /**int number;
        do {
            System.out.print(" Geben Sie ein Nummer zwischen  1 y 100 ein: ");
            number = sc.nextInt();
        } while (number < 1 || number > 100);
        System.out.println(number + " romanische Nummer -> " + NumberToRoman.convertToRomanNumber(number));
        **/
        String roman = "";

        do {
            System.out.println("Geben Sie ein romasiche Character (Maximal C)");
            roman = sc.nextLine().toString();

        }while (roman == "");
        System.out.println(roman + "arabische Nummer --> "+ RomanToNumber.convertToArabicNumber(roman));


    }

}
