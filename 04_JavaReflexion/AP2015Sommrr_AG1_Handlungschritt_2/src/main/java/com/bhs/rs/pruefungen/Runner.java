package com.bhs.rs.pruefungen;

import com.bhs.rs.pruefungen.Aufgaben.*;
import com.bhs.rs.pruefungen.Views.*;



/**
 * Created by JAbanto on 15.01.2018.
 */
public class Runner {

    private Menu menu ;

    public Runner(){}

    public void run(){
        initMenu();
        menu.doLoop();
        ViewTools.output("Waiting to be closed...");
    }


    private void initMenu() {

        menu = new Menu("RS-Aufgaben-AP2 | (c) 2018 by BHS GmbH, Weiherhammer, Germany",
                new MenuItem("Sommer 2015 GA1 HS2, LKW ", new Sommer2015_GA1_H2_LKW("S2015_A1_H2")),
                new MenuItem("Sommer 2015 GA1 HS3, Angebot Erstellung", new Sommer2015_GA1_H3_Angebot("S2015_A1_H3")),
                new MenuItem("Winter 2013 GA1 HS3, Report", new Winter2013_GA1_H3_Report("W2013_A1_H3")),
                new MenuItem("Winter 2011 GA1 H2, Password Generator mit ASCII", new Winter2011_GA1_H2_PGenerator("W2011_A1_H2")),
                new MenuItem("Winter 2015 GA1 HS2, User Logout", new Winter2015_GA1_H5_Logout("W2015_A1_H5")),
                new MenuItem("Sommer 2014 GA1 HS3, Rechnungerstellung" , new Sommer2014_GA1_HS3_Rechnung("S2014_A1_H3")),
                new MenuItem("Sommer 2014 GA1 HS4, QRerstellung" , new Sommer2014_GA1_HS3_Rechnung("S2014_A1_H4"))
        );
    }

}
