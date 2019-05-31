package cityBike;


import java.util.ArrayList;

public class Station {


    private static int counter = 1;
    private Integer stationId;
    private String location;
    private ArrayList<Integer> bikes;

    Station(String location) {
        this.stationId = counter++;
        this.location = location;
        this.bikes = new ArrayList<>();

    }

    public Station() {
    }               //to be able to check the station

    public int getStationId() {
        return this.stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public ArrayList<Integer> getBikes() {
        return this.bikes;
    }


    //adds bikes to station
    public void addBike(Integer bikeId) {
        this.bikes.add(bikeId);
    }

    //method to remove bike from stations
    public void removeBike(Integer bikeId) {
        this.bikes.remove(bikeId);
    }

    public void returnBike(Integer bikeId) {
        if (this.bikes.size() <= 5) {
            addBike(bikeId);
            Main.checkUser(bikeId);
        } else {
            System.out.println("Sorry this station is already full");
        }
    }
}



