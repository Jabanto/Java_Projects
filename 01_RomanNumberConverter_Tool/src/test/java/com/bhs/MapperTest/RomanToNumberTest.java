package com.bhs.MapperTest;

import com.bhs.Mapper.NumberConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by JAbanto on 05.10.2017.
 */
public class RomanToNumberTest {


    @Test
    public void RomanToNumberTest(){
        assertEquals(2, NumberConverter.convertToArabicNumber("II"));
    }

    @Test
    public void RomanToNumberTest4(){
        assertEquals(4, NumberConverter.convertToArabicNumber("IV"));
    }

    @Test
    public void RomanToNumberTestFor9_11(){
        assertEquals(9, NumberConverter.convertToArabicNumber("IX"));
        assertEquals(9, NumberConverter.convertToArabicNumber("XI"));

    }
    @Test
    public void RomanToNumberTestFor19(){
        assertEquals(19, NumberConverter.convertToArabicNumber("XIX"));
    }

    @Test
    public void RomanToNumberTestFor39_40(){
        assertEquals(39, NumberConverter.convertToArabicNumber("XXXIX"));
        assertEquals(40, NumberConverter.convertToArabicNumber("XL"));
    }

    @Test
    public void RomanToNumberTestFor89_90_100(){
        assertEquals(90, NumberConverter.convertToArabicNumber("XC"));
        assertEquals(89, NumberConverter.convertToArabicNumber("LXXXIX"));
        assertEquals(100, NumberConverter.convertToArabicNumber("C"));
    }

}