package cityBike;


import java.util.ArrayList;

public class Station {


    private static int counter = 1;
    private Integer stationId;
    private String location;
    private ArrayList<Bike> bikesInStat;

    Station(String location) {
        this.stationId = counter++;
        this.location = location;
        this.bikesInStat = new ArrayList<>();

    }

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


    public void setBikesInStat(ArrayList<Bike> bikesInStat) {
        this.bikesInStat = bikesInStat;
    }

    public ArrayList<Bike> getBikesInStat() {
        return this.bikesInStat;
    }



    //method to add bikes to stations if it is not already full
    public void addBike(Bike bikeId) {
        if (bikesInStat.size() >= 5) {
            System.out.println("Sorry you can not add more bikes to this station");
        } else {
            this.bikesInStat.add(bikeId);
        }
       }

        //method to remove bike from stations
        public void removeBike (Bike bikeId){
            this.bikesInStat.remove(bikeId);
        }
    }
