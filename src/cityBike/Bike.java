package cityBike;


import java.util.GregorianCalendar;

public class Bike {


    private Integer bikeId;
    private String color;
    GregorianCalendar rentStart;
    GregorianCalendar rentEnd;
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
        GregorianCalendar rentStart = null;
        GregorianCalendar rentEnd = null;
    }

    public int getBikeId(){
        return this.bikeId;
    }

    public void setBikeId(int bikeId){
        this.bikeId=bikeId;
    }

    public String getColor(){
        return this.color;
    }

    public Status getaStatus() {
        return aStatus;
    }

    public void setaStatus(Status aStatus){
        this.aStatus= aStatus;
    }
}


