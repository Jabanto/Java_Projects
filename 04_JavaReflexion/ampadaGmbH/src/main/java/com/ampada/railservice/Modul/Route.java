package com.ampada.railservice.Modul;

import com.ampada.railservice.Service.RailService;

import java.util.ArrayList;

public class Route {


    private ArrayList<Trip> routeList = new ArrayList<Trip>();
    private String routeName;

    public Route(){
        fillRouteList();
    }

    public Route(String routeName){
        this.routeName=routeName;
        fillRouteList();
    }



    private void fillRouteList() {

        Trip tripAB = new Trip("AB",5);
        Trip tripBC = new Trip("BC",4);
        Trip tripCD = new Trip("CD",8);
        Trip tripDC = new Trip("DC",8);
        Trip tripDE = new Trip("DE",6);
        Trip tripAD = new Trip("AD",5);
        Trip tripCE = new Trip("CE",2);
        Trip tripEB = new Trip("EB",3);
        Trip tripAE = new Trip("AE",7);

        routeList.add(tripAB);
        routeList.add(tripBC);
        routeList.add(tripCD);
        routeList.add(tripDC);
        routeList.add(tripDE);
        routeList.add(tripAD);
        routeList.add(tripCE);
        routeList.add(tripEB);
        routeList.add(tripAE);

    }



    // Region Setter and Getter

    public ArrayList<Trip> getRouteList() { return routeList; }

    public void setRouteList(ArrayList<Trip> routeList) { this.routeList = routeList; }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }


}
