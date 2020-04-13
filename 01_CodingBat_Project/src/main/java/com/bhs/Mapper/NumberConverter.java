package com.bhs.Mapper;

import com.bhs.Main.Roman;

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

        Roman romanObject = new Roman();

        String roman = "";

        for (int i = 0; i < romanObject.getRomanList().length; i++) {

            while (arabicNumber % romanObject.getDecimalList()[i] < arabicNumber) {

                roman += romanObject.getRomanList()[i];

                arabicNumber -= romanObject.getDecimalList()[i];

            }

        }

        return roman;

    }

    /**
     * Convert the romanNumber to a valid arabic number
     * @param romanNumber the value {@code string} to convert
     * @return a arabic number value {@code int}
     */
    public static int convertToArabicNumber(String romanNumber) {

            Roman romanObject = new Roman();

            int arabic = 0;
            int result = 0;

            for (int i = 0; i < romanObject.getDecimalList().length ; i++) {

                String romanOfList = romanObject.getRomanList()[i];
                result = romanNumber.lastIndexOf(romanOfList);
                while (result != -1){


                    arabic += romanObject.getDecimalList()[i];

                    if (romanNumber.length()>1) {

                        String restChar = romanNumber.substring(0,romanNumber.length()-1);
                        romanNumber = restChar;

                    }else {
                        romanNumber = romanNumber.replace(romanObject.getRomanList()[i],"''");
                    }
                }

            }

            /**
             for (int i = 0 ; i < roman.length();i++ ){

             String capture  = roman.substring(i,i+1);

             if (i<roman.length()-1){
             after = roman.substring(i+1,i+2);
             }

             if (capture.equals("C")&&previous.equals("X")){

             arabic -= 10;
             }

             if (capture.equals("C")){

             arabic += 100;
             }


             if (capture.equals("L")&&previous.equals("X")){
             arabic -= 10;
             }

             if (capture.equals("L")){

             arabic += 50;
             }

             if (capture.equals("I")&&!after.equals("V")&&!after.equals("X")){
             arabic += 1;
             }

             if (capture.equals("V")&&previous.equals("I")){
             arabic -= 1;
             }

             if (capture.equals("V")){
             arabic += 5;
             }


             if (capture.equals("X")&&previous.equals("I")){
             arabic -= 1;
             }

             if (capture.equals("X")&& !after.equals("C")&& !after.equals("L")){
             arabic += 10;
             }

             previous = capture;

             }

             **/
            return arabic;
        }
}