package com.bhs.Mapper;

import com.bhs.Main.Definitions;

/**
 * This class manage and declare the call to the converter methods
 *
 * <pre>
 *     NumberConverter.convertToRomanNumber(arabicNumber) or NumberConverter.convertToArabicNumber(romanNumber)
 * </pre>
 *
 * @author JefeMaestro
 * @version 1.0.0
 */
public abstract class NumberConverter {


    /**
     * Convert the passed arabicNumber to a valid roman number
     * @param arabicNumber the value {@code int} to convert
     * @return a roman number value {@code string}
     */
    public static String convertToRomanNumber(int arabicNumber) {

        Definitions romanObject = new Definitions();
        String romanNumber = "";

        for (int i = 0; i < romanObject.getRomanList().length; i++) {

            while (arabicNumber % romanObject.getDecimalList()[i] < arabicNumber) {

                romanNumber += romanObject.getRomanList()[i];
                arabicNumber -= romanObject.getDecimalList()[i];

            }
        }
        return romanNumber;

    }

    /**
     * Convert the romanNumber to a valid arabic number
     * @param romanNumber the value {@code string} to convert
     * @return a arabic number value {@code int}
     */
    public static int convertToArabicNumber(String romanNumber) {


        // Initialize result , final arabic number and Romanobject to find  values

        Definitions romanObject = new Definitions();
        int arabic = 0;
        int result = 0;

            //Traverse given input
            for (int i = 0; i<romanNumber.length() ; i++) {

                // Getting  value of symbol s[i]
                int simbol_1 = romanObject.returnValueOfRoman(romanNumber.charAt(i));

                // Getting value of symbol s[i+1]
                if (i+1 < romanNumber.length()){

                    int simbol_2 = romanObject.returnValueOfRoman(romanNumber.charAt(i+1));
                    //Comparing both Values
                    if (simbol_1 >= simbol_2){

                        // Value of current symbol is greater
                        // or equal to the next symbol
                        result = result + simbol_1;
                    }else {
                         result = result + simbol_2 - simbol_1;
                         i++; // Value of current symbol is less than the  next symbol

                    }
                }
                else {

                    result = result + simbol_1;
                    i++;

                }
            }
            arabic = result;
            return arabic;
        }
}