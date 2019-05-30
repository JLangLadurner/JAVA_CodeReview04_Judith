package cityBike;


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


        Bike bike1 = new Bike ("red", Bike.Status.CanBeRented);
        Bike bike2 = new Bike ("blue", Bike.Status.CanBeRented);
        Bike bike3 = new Bike ("white", Bike.Status.CanNotBeRented);
        Bike bike4 = new Bike ("black", Bike.Status.Discarded);
        Bike bike5 = new Bike ("purple", Bike.Status.InService);
        Bike bike6 = new Bike ("green", Bike.Status.CanBeRented);
        Bike bike7 = new Bike ("white", Bike.Status.CanBeRented);
        Bike bike8 = new Bike ("rose", Bike.Status.InService);

        HashMap<String, Bike> bikes = new HashMap<>();
        bikes.put("bikeId1", bike1);
        bikes.put("bikeId2", bike2);
        bikes.put("bikeId3", bike3);
        bikes.put("bikeId4", bike4);
        bikes.put("bikeId5", bike5);
        bikes.put("bikeId6", bike6);
        bikes.put("bikeId7", bike7);
        bikes.put("bikeId8", bike8);

        Station stat1 = new Station("Karlsplatz",5);
        Station stat2 = new Station("Schwedenplatz",10);
        Station stat3 = new Station("Stephansplatz", 10);

        HashMap<String, Station>stations = new HashMap<>();
        stations.put("stationId1", stat1);
        stations.put("stationId2", stat2);
        stations.put("stationId3", stat3);

    }
    }






