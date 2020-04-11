package com.bhs.rs.pruefungen.Util;

import com.bhs.rs.pruefungen.Parsing.XML_work;
import com.bhs.rs.pruefungen.Views.MenuItem;
import com.bhs.rs.pruefungen.Views.ViewTools;

import javax.swing.*;

public class AufgabenContext {
    private static final String CONTINUE_KEY = "s";
    private String beschreibung;
    private String aufgabeCode;
    private XML_work xml_work;
    private Boolean starten;

    public AufgabenContext(String code) {
        this.aufgabeCode = code;
        this.beschreibung = null;
        this.xml_work = new XML_work();
        this.starten = null;
    }

    public void getBeschreibung() {
        beschreibung = xml_work.getDescriptionByID(aufgabeCode);
        ViewTools.output(beschreibung);
    }

    public void doLoop() {
        starten = true;
        ViewTools.clearScreen();
        while (starten) {
            readInput();
        }
    }

    private void readInput() {
        String key = ViewTools.readInput(" Enter '" + CONTINUE_KEY + "' + for start, then press [ENTER]\n\n").toLowerCase();
        if (key.equals(CONTINUE_KEY)) {
            ViewTools.separator();
            ViewTools.output("Startiing Exercice...");
            starten = false;
            ViewTools.clearScreen();
        }
    }



}
