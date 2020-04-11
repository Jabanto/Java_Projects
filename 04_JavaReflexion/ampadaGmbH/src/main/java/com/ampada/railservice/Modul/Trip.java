package com.ampada.railservice.Modul;

public class Trip {

    private String nameTrip;
    private int distanceTrip;

    public Trip(){}

    public Trip(String name , int distance){

        this.nameTrip=name;
        this.distanceTrip = distance;
    }


    public int getDistanceTrip() {
        return distanceTrip;
    }

    public void setDistanceTrip(int distanceTrip) {
        this.distanceTrip = distanceTrip;
    }

    public String getNameTrip() {
        return nameTrip;
    }

    public void setNameTrip(String nameTrip) {
        this.nameTrip = nameTrip;
    }
}
