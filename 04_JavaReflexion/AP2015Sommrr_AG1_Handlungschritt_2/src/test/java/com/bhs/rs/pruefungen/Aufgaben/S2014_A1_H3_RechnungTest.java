package com.bhs.rs.pruefungen.Aufgaben;

import org.junit.Test;

import static org.junit.Assert.*;

public class S2014_A1_H3_RechnungTest {

    private static final String AUFGABE_CODE = "S2014_A1_H3";

    Sommer2014_GA1_HS3_Rechnung sommer2014_ga1_hs3_rechnung = new Sommer2014_GA1_HS3_Rechnung(AUFGABE_CODE);

    @Test
    public void execute() {

        sommer2014_ga1_hs3_rechnung.execute();
    }
}