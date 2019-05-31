package cityBike;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        User usr1 = new User("Otto", "Bismark", "ottobismark@email.com");
        User usr2 = new User("Karin", "Bing", "bing@email.com");
        User usr3 = new User("Kurt", "Holz", "holz@email.com");

        HashMap<Integer, User> users = new HashMap<>();
        users.put(usr1.userId, usr1);
        users.put(usr2.userId, usr2);
        users.put(usr3.userId, usr3);


        Bike bike1 = new Bike("red", Bike.Status.CanBeRented);
        Bike bike2 = new Bike("blue", Bike.Status.CanBeRented);
        Bike bike3 = new Bike("white", Bike.Status.CanBeRented);
        Bike bike4 = new Bike("black", Bike.Status.CanBeRented);
        Bike bike5 = new Bike("purple", Bike.Status.CanBeRented);
        Bike bike6 = new Bike("green", Bike.Status.CanBeRented);
        Bike bike7 = new Bike("white", Bike.Status.CanBeRented);
        Bike bike8 = new Bike("rose", Bike.Status.InService);

        HashMap<Integer, Bike> bikes = new HashMap<>();
        bikes.put(bike1.getBikeId(), bike1);
        bikes.put(bike2.getBikeId(), bike2);
        bikes.put(bike3.getBikeId(), bike3);
        bikes.put(bike4.getBikeId(), bike4);
        bikes.put(bike5.getBikeId(), bike5);
        bikes.put(bike6.getBikeId(), bike6);
        bikes.put(bike7.getBikeId(), bike7);
        bikes.put(bike8.getBikeId(), bike8);

        //creates Station
        Station station1 = new Station("Schwedenplatz");
        Station station2 = new Station("Karlsplatz");
        Station station3 = new Station("Stephansplatz");

        //creates Haschmap for station
        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(station1.getStationId(),station1);
        stations.put(station2.getStationId(), station2);
        stations.put(station3.getStationId(), station3);

        //adds bikes to station
        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);
        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);


        System.out.println(station1.getBikesInStat().toString());
        System.out.println(station2.getBikesInStat().toString());


        }

    }








