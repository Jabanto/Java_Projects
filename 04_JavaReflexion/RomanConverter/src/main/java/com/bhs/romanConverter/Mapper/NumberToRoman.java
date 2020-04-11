package com.bhs.romanConverter.Mapper;

/**
 * Created by JAbanto on 05.10.2017.
 */
public abstract class NumberToRoman {

        public static String convertToRomanNumber(int number) {

            // milles , centenas , decenas, unidades
            int i, tausend, hundred, tener, unit;
            String roman = "";
            

            hundred = number / 100 % 10;
            tener = number / 10 % 10;
            unit = number % 10;


            //hunderd
            if (hundred == 9) {
                roman = roman + "CM";
            } else if (hundred >= 5) {
                roman = roman + "D";
                for (i = 6; i <= hundred; i++) {
                    roman = roman + "C";
                }
            } else if (hundred == 4) {
                roman = roman + "CD";
            } else {
                for (i = 1; i <= hundred; i++) {
                    roman = roman + "C";
                }
            }

            //tener
            if (tener == 9) {
                roman = roman + "XC";
            } else if (tener >= 5) {
                roman = roman + "L";
                for (i = 6; i <= tener; i++) {
                    roman = roman + "X";
                }
            } else if (tener == 4) {
                roman = roman + "XL";
            } else {
                for (i = 1; i <= tener; i++) {
                    roman = roman + "X";
                }
            }

            //unit
            if (unit == 9) {
                roman = roman + "IX";
            } else if (unit >= 5) {
                roman = roman + "V";
                for (i = 6; i <= unit; i++) {
                    roman = roman + "I";
                }
            } else if (unit == 4) {
                roman = roman + "IV";
            } else {
                for (i = 1; i <= unit; i++) {
                    roman = roman + "I";
                }
            }
            return roman;
        }


}
