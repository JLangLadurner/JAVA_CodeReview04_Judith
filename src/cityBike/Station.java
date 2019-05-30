package cityBike;


import java.util.ArrayList;

public class Station {


    public static int counter = 1;
    public Integer stationId;
    public String location;
    ArrayList<String>bikes;

    Station(String location){
        this.stationId = counter++;
        this.location = location;
        this.bikes = new ArrayList<>();

    }

    public void addBike (ArrayList<String>bikes){

    }

}
