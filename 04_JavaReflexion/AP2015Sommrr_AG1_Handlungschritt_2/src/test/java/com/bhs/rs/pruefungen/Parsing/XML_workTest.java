package com.bhs.rs.pruefungen.Parsing;

import org.junit.Assert;
import org.junit.Test;

public class XML_workTest {

    public XML_work xml_leser = new XML_work();
    public String xmlUserPath = "src/main/resources/aufgaben/W2015_A1_H5.xml";

    @Test
    public void xmlLeserTest(){

        String aufgabeID_Test = "W2015_A1_H5";
        Assert.assertNotSame("",xml_leser.getDescriptionByID(aufgabeID_Test));
        Assert.assertNotNull(xml_leser.getDescriptionByID(aufgabeID_Test));

    }

    @Test
    public void loadXML(){
        xml_leser.loadXML(xmlUserPath);
    }

}