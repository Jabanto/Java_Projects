package com.bhs.rs.pruefungen.Views;

import com.bhs.rs.pruefungen.Model.Aufgabe;

/**
 * Created by JAbanto on 15.01.2018.
 */
public class MenuItem {

    private final String name;
    private Aufgabe aufgabe;

    public MenuItem(String name, Aufgabe aufgabe) {
        this.name = name;
        this.aufgabe = aufgabe;
    }

    public void execute(){

        aufgabe.execute();
        aufgabe.postExecution();

    }


    public String getName() {
        return name;

    }
}