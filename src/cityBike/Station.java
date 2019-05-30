package cityBike;

import java.util.ArrayList;

public class Station {

    public static int counter;

    public String stationId;
    public String location;
    public int capacity;
    ArrayList<String>station;

    Station(String location, int capacity, ArrayList<String>station){
        counter++;
        this.stationId = "stationId"+counter;
        this.location = location;
        this.capacity = 0;
    }


}
