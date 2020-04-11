package com.bhs.romanConverter.Mapper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by JAbanto on 05.10.2017.
 */
public class RomanToNumberTest {


    @Test
    public void RomanToNumberTestNine(){

        assertEquals(2,RomanToNumber.convertToArabicNumber("II"));
    }

}