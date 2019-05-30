package cityBike;


import java.util.ArrayList;

public class Station {


    public static int counter = 1;
    public Integer stationId;
    public String location;
    ArrayList<Integer>bikes;

    Station(String location){
        this.stationId = counter++;
        this.location = location;
        this.bikes = new ArrayList<>();

    }
    //method to add bikes to stations
    public void addBike (Integer bikeId){
           this.bikes.add(bikeId);
    }
    //method to remove bike from stations
    public void removeBike (Integer bikeId){
        this.bikes.remove(bikeId);
    }

}
