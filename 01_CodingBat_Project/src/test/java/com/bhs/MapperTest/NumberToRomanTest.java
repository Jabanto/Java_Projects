package com.bhs.MapperTest;


import com.bhs.Mapper.NumberConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JAbanto on 05.10.2017.
 */
public class NumberToRomanTest {

    /** wie so geht nicht mit extends Case . also mit den Framework junit)**/



    @Test
    public void NumberToRomanTestNine(){
        assertEquals("XII", NumberConverter.convertToRomanNumber(12));
    }

    @Test
    public void NumberToRomanTestTen(){
        assertEquals("X", NumberConverter.convertToRomanNumber(10));

    }@Test
    public void NumberToRomanTestFihteen(){

        assertEquals("XV", NumberConverter.convertToRomanNumber(15));

    }
    @Test
    public void NumberToRomanTestTwenty(){

        assertEquals("XX", NumberConverter.convertToRomanNumber(20));

    }
    @Test
    public void NumberToRomanTest30_39(){

        assertEquals("XXXIX", NumberConverter.convertToRomanNumber(39));
        assertEquals("XXX", NumberConverter.convertToRomanNumber(30));

    }

    @Test
    public void NumberToRomanTest40_to89(){

        assertEquals("XL", NumberConverter.convertToRomanNumber(40));
        assertEquals("LXXXIX", NumberConverter.convertToRomanNumber(89));

    }

    @Test
    public void NumberToRomanTest90_to100 (){

        assertEquals("XC", NumberConverter.convertToRomanNumber(90));
        assertEquals("C", NumberConverter.convertToRomanNumber(100));

    }



}