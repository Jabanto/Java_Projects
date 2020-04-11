package com.bhs.rs.pruefungen.Aufgaben;

import org.junit.Test;

import static org.junit.Assert.*;

public class S2015_A1_H2_LKWTest {

    private static final String AUFGABE_CODE = "S2015_A1_H2";

    Sommer2015_GA1_H2_LKW lkwtest = new Sommer2015_GA1_H2_LKW(AUFGABE_CODE);

    @Test
    public void executeTest() {
        lkwtest.execute();
    }
}