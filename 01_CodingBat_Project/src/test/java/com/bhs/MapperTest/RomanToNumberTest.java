package com.bhs.MapperTest;

import com.bhs.Mapper.RomanToNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by JAbanto on 05.10.2017.
 */
public class RomanToNumberTest {


    @Test
    public void RomanToNumberTest(){

        //assertEquals(2, RomanToNumber.convertToArabicNumber("II"));
    }
    @Test
    public void RomanToNumberTest4(){

        assertEquals(4, RomanToNumber.convertToArabicNumber("IV"));
    }

    @Test
    public void RomanToNumberTestfor9(){

        assertEquals(9, RomanToNumber.convertToArabicNumber("IX"));
    }

    @Test
    public void RomanToNumberTestfor19(){

        assertEquals(19, RomanToNumber.convertToArabicNumber("XIX"));
    }
    @Test
    public void RomanToNumberTestfor39_40(){

        assertEquals(39, RomanToNumber.convertToArabicNumber("XXXIX"));
        assertEquals(40, RomanToNumber.convertToArabicNumber("XL"));
    }

    @Test
    public void RomanToNumberTestfor89_90_100(){

        assertEquals(89, RomanToNumber.convertToArabicNumber("LXXXIX"));
        assertEquals(90, RomanToNumber.convertToArabicNumber("XC"));
        assertEquals(100, RomanToNumber.convertToArabicNumber("C"));

    }


}