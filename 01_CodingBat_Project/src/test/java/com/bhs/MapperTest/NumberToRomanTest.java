package com.bhs.MapperTest;


import com.bhs.Mapper.NumberToRoman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JAbanto on 05.10.2017.
 */
public class NumberToRomanTest {

    /** wie so geht nicht mit extends Case . also mit den Framework junit)**/



    @Test
    public void NumberToRomanTestNine(){
        assertEquals("XII", NumberToRoman.convertToRomanNumber(12));
    }

    @Test
    public void NumberToRomanTestTen(){
        assertEquals("X", NumberToRoman.convertToRomanNumber(10));

    }@Test
    public void NumberToRomanTestFihteen(){

        assertEquals("XV", NumberToRoman.convertToRomanNumber(15));

    }
    @Test
    public void NumberToRomanTestTwenty(){

        assertEquals("XX", NumberToRoman.convertToRomanNumber(20));

    }
    @Test
    public void NumberToRomanTest30_39(){

        assertEquals("XXXIX", NumberToRoman.convertToRomanNumber(39));
        assertEquals("XXX", NumberToRoman.convertToRomanNumber(30));

    }

    @Test
    public void NumberToRomanTest40_to89(){

        assertEquals("XL", NumberToRoman.convertToRomanNumber(40));
        assertEquals("LXXXIX", NumberToRoman.convertToRomanNumber(89));

    }

    @Test
    public void NumberToRomanTest90_to100 (){

        assertEquals("XC", NumberToRoman.convertToRomanNumber(90));
        assertEquals("C", NumberToRoman.convertToRomanNumber(100));

    }



}