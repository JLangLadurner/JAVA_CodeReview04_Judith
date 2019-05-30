package cityBike;


import java.util.GregorianCalendar;

public class Bike {


    public Integer bikeId;
    public String color;
    GregorianCalendar rentStart;
    GregorianCalendar rentEnd;
    public Status aStatus;
    public static Integer counter =1;
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
        GregorianCalendar rentStart = null;
        GregorianCalendar rentEnd = null;
    }


}
