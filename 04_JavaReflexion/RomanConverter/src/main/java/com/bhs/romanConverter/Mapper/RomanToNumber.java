package com.bhs.romanConverter.Mapper;

/**
 * Created by JAbanto on 05.10.2017.
 */
public abstract class RomanToNumber {

    public static int convertToArabicNumber(String roman) {


        int arabic = 0;


        for (int i = 0 ; i < roman.length();i++ ){

            String capture  = roman.substring(i,i+1);

            if (capture=="I"){
                arabic += 1;

            } else if (capture=="V"){

                arabic += 5;

            } else if (capture=="X"){

                arabic += 10;
            }

        }

        return arabic;

    }
}
