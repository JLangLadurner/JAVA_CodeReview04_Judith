package cityBike;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        User usr1 = new User("Otto", "Bismark", "ottobismark@email.com", "otto");
        User usr2 = new User("Karin", "Bing", "bing@email.com", "bing");
        User usr3 = new User("Kurt", "Holz", "holz@email.com", "holz");

        HashMap<String, User> users = new HashMap<>();
        users.put("userId1", usr1);
        users.put("userId2", usr2);
        users.put("userId3", usr3);


        Bike bike1 = new Bike("red", Bike.Status.CanBeRented);
        Bike bike2 = new Bike("blue", Bike.Status.CanBeRented);
        Bike bike3 = new Bike("white", Bike.Status.CanNotBeRented);
        Bike bike4 = new Bike("black", Bike.Status.Discarded);
        Bike bike5 = new Bike("purple", Bike.Status.InService);
        Bike bike6 = new Bike("green", Bike.Status.CanBeRented);
        Bike bike7 = new Bike("white", Bike.Status.CanBeRented);
        Bike bike8 = new Bike("rose", Bike.Status.InService);

        HashMap<Integer, Bike> bikes = new HashMap<>();
        bikes.put(1, bike1);
        bikes.put(2, bike2);
        bikes.put(3, bike3);
        bikes.put(4, bike4);
        bikes.put(5, bike5);
        bikes.put(6, bike6);
        bikes.put(7, bike7);
        bikes.put(8, bike8);

    //creates Station
        Station station1 = new Station("Schwedenplatz");
        Station station2 = new Station("Karlsplatz");
        Station station3 = new Station("Stephansplatz");

    //creates key and value for stations
        HashMap<Integer, Station> stations = new HashMap<>();
        stations.put(1, station1);
        stations.put(2, station2);
        stations.put(3, station3);

    //adds bikes to station
        station1.addBike(1);
        station1.addBike(2);
        station1.addBike(3);
        station2.addBike(4);
        station2.addBike(5);
        station2.addBike(6);
        station2.addBike(7);


    }
    }







