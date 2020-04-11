package com.ampada.railservice.Service;


import com.ampada.railservice.Modul.Route;
import com.ampada.railservice.Modul.Trip;

import java.util.ArrayList;

public class RailService {

    private Route route;
    private String location;

    public RailService(){

        this.route = new Route();
    }

    public RailService(String routeName) {

        this.route = new Route(routeName);

    }

    public void getRouteDistance(){

        int totalDistance = calculateDistance();

        if (totalDistance!=0){
            System.out.println("Output : " + totalDistance);
        }
    }

    private int calculateDistance() {

        String routeName = route.getRouteName();
        int distance;
        int totalDistance = 0;

        for (int i = 0; i+1 < routeName.length(); i++ ){

            String routeSeccion = routeName.substring(i,i+2);
            distance = 0;
            for (Trip trip:route.getRouteList()) {
                if (trip.getNameTrip().equals(routeSeccion))
                    distance = trip.getDistanceTrip();
            }
            if (distance==0){
                getRouteAlert();
                totalDistance=0;
                break;
            }
            totalDistance = totalDistance + distance;
        }

        return totalDistance;
    }

    public void numberOfTrips(String location) {

        int numberOfTrips = 0;
        this.location = location;
        ArrayList<Trip> listOfStar = new ArrayList<Trip>();

        for (Trip trip: route.getRouteList()) {
            String firstPosition = trip.getNameTrip().substring(0, 1);
            if (firstPosition.equals(location)) {
                listOfStar.add(trip);
            }
        }

        numberOfTrips = calculateRoute(listOfStar);

        System.out.println("Ouput : " + numberOfTrips);
    }

    private int calculateRoute(ArrayList<Trip> list) {

        int numberRoutes = 0;
        int numberStops = 1;
        String seconLocation;

        for (Trip trip: list){
            seconLocation = trip.getNameTrip().substring(1);

            for (Trip tripOfList: route.getRouteList()){

                if (tripOfList.getNameTrip().startsWith(seconLocation) ){

                    numberStops++;
                    String secondLetter = tripOfList.getNameTrip().substring(1,2);
                    if (numberRoutes<4&&secondLetter.endsWith(location)){
                        numberRoutes++;
                        break;
                    }else {
                        numberRoutes++;
                    }

                }

            }

        }

        return numberRoutes;

    }


    private void getRouteAlert() {
        System.out.println("NO SUCH ROUTE");
    }

}
