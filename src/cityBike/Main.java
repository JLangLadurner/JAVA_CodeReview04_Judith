package cityBike;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<Integer, Bike> bikes = new HashMap<>();
    static HashMap<Integer, Station> stations = new HashMap<>();
    static HashMap<Integer, User> users = new HashMap<>();


    public static void main(String[] args) {

        Bike bike1 = new Bike("red", Bike.Status.CanBeRented);
        Bike bike2 = new Bike("blue", Bike.Status.CanBeRented);
        Bike bike3 = new Bike("white", Bike.Status.CanBeRented);
        Bike bike4 = new Bike("black", Bike.Status.CanBeRented);
        Bike bike5 = new Bike("purple", Bike.Status.CanBeRented);
        Bike bike6 = new Bike("green", Bike.Status.CanBeRented);
        Bike bike7 = new Bike("white", Bike.Status.CanBeRented);
        Bike bike8 = new Bike("rose", Bike.Status.InService);


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

        stations.put(station1.getStationId(), station1);
        stations.put(station2.getStationId(), station2);
        stations.put(station3.getStationId(), station3);

        //adds bikes to station
        station1.addBike(1);
        station1.addBike(2);
        station1.addBike(3);
        station2.addBike(4);
        station2.addBike(5);
        station2.addBike(6);
        station2.addBike(7);

        User usr1 = new User("Otto", "Bismark");
        User usr2 = new User("Karin", "Bing");
        User usr3 = new User("Kurt", "Holz");

        users.put(usr1.getUserId(), usr1);
        users.put(usr2.getUserId(), usr2);
        users.put(usr3.getUserId(), usr3);

        //research:https://www.youtube.com/watch?v=HcjHJLEbtRs - Transaction Management Java
        //https://www.youtube.com/watch?v=c3RVW3KGIIE - HashMaps in Java

        System.out.println("user: " + usr1.getCurrRentedBike());
        System.out.println("Station: "+ station1.getBikes().toString());
        usr1.rentABike(2);
        System.out.println("user: " + usr1.getCurrRentedBike());
        System.out.println("Station: " + station1.getBikes().toString());

        //output:
        //user: null
        //Station: [1, 2, 3]
        //user: 2
        //Station: [1, 3]
        station1.returnBike(2);
        System.out.println("User :" +  usr1.getCurrRentedBike());
        System.out.println("Station:"+station1.getBikes().toString());
        //output:
        //User :null
        //Station:[1, 3, 2]




    }

    public static void checkStation(Integer bikeId) {
        Station st = new Station();//create new station
        for (Map.Entry<Integer, Station> entry : stations.entrySet()) {//check station hashmap
            if (entry.getValue().getBikes().contains(bikeId)) { //if there is a value...
                st = entry.getValue();
                break;
            }
        }
        st.removeBike(bikeId);
    }

    public static void checkUser(Integer bikeId){
        User user = new User();
        for(Map.Entry<Integer, User> entry: users.entrySet()){
            if(entry.getValue().getCurrRentedBike()== bikeId){
                user = entry.getValue();
                break;
            }
        }
        user.removeBike(bikeId);
    }
}








