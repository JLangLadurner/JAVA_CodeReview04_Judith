package cityBike;


import java.util.GregorianCalendar;

public class Bike {


    private Integer bikeId;
    private String color;
    private Status aStatus;
    private static Integer counter =1;
    public enum Status{
        CanBeRented,
        CanNotBeRented,
        InService,
        Discarded
    }

    Bike(String color, Status aStatus){
        this.bikeId = counter++;
        this.color = color;
        this.aStatus= aStatus;

    }

    public int getBikeId(){
        return this.bikeId;
    }


    public String getColor(){
        return this.color;
    }

    public Status getaStatus() {
        return aStatus;
    }

}


