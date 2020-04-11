package com.bhs.rs.pruefungen.Model;

import com.bhs.rs.pruefungen.Views.ViewTools;

/**
 * Created by JAbanto on 15.01.2018.
 */
public abstract class Aufgabe {

    public abstract void execute();

    public void postExecution(){

        ViewTools.waitForReturn();}

}
