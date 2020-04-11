package com.bhs.Mapper;

import com.bhs.Main.Roman;

/**
 * Created by JAbanto on 05.10.2017.
 */
public abstract class RomanToNumber {

    public static int convertToArabicNumber(String roman) {

        Roman romanObject = new Roman();

        int arabic = 0;
        int result = 0;

        for (int i = 0; i < romanObject.getDecimalList().length ; i++) {

            String romanOfList = romanObject.getRomanList()[i];
            result = roman.lastIndexOf(romanOfList);
            while (result != -1){


                arabic += romanObject.getDecimalList()[i];

                if (roman.length()>1) {

                    String restChar = roman.substring(0,roman.length()-1);
                    roman = restChar;



                }else {
                    roman = roman.replace(romanObject.getRomanList()[i],"''");
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
