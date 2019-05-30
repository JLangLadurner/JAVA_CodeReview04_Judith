package cityBike;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //research
    //move outside of main to be accessible for method/add 'static'
    static HashMap<Integer, User> users = new HashMap<>();
    static HashMap<Integer, Bike> bikes = new HashMap<>();
    static HashMap<Integer, Station> stations = new HashMap<>();


    public static void main(String[] args) {

        User usr1 = new User("Otto", "Bismark", "ottobismark@email.com");
        User usr2 = new User("Karin", "Bing", "bing@email.com");
        User usr3 = new User("Kurt", "Holz", "holz@email.com");


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


        bikes.put(bike1.bikeId, bike1);
        bikes.put(bike2.bikeId, bike2);
        bikes.put(bike3.bikeId, bike3);
        bikes.put(bike4.bikeId, bike4);
        bikes.put(bike5.bikeId, bike5);
        bikes.put(bike6.bikeId, bike6);
        bikes.put(bike7.bikeId, bike7);
        bikes.put(bike8.bikeId, bike8);

        //creates Station
        Station station1 = new Station("Schwedenplatz");
        Station station2 = new Station("Karlsplatz");
        Station station3 = new Station("Stephansplatz");

        //creates key and value for stations

        stations.put(station1.stationId, station1);
        stations.put(station2.stationId, station2);
        stations.put(station3.stationId, station3);

        //adds bikes to station
        station1.addBike(1);
        station1.addBike(2);
        station1.addBike(3);
        station2.addBike(4);
        station2.addBike(5);
        station2.addBike(6);
        station2.addBike(7);


        System.out.println(station1.bikes.toString());//output:  [1, 2, 3]
        System.out.println(station2.bikes.toString());//output: [4, 5, 6, 7]


        }

    }








