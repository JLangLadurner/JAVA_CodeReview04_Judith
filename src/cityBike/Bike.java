package cityBike;


import java.util.GregorianCalendar;

public class Bike {

    public static int counter;

    public String bikeId;
    public String color;
    GregorianCalendar rentStart;
    GregorianCalendar rentEnd;
    public Status aStatus;
    public enum Status{
        CanBeRented,
        CanNotBeRented,
        InService,
        Discarded
    }

    Bike(String color, Status aStatus){
        counter++;
        this.bikeId = "bikeId"+counter;
        this.color = color;
        this.aStatus= aStatus;
        GregorianCalendar rentStart = null;
        GregorianCalendar rentEnd = null;
    }
}
