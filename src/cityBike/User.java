package cityBike;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class User {


    private static Integer counter =1;
    private Integer userId;
    private String userFirstName;
    private String userLastName;
    private Integer currRentedBike;
    private Rent rent;
    private ArrayList<Rent>rents = new ArrayList<>();


    ArrayList<String> userRentBike;

    User (String userFirstName, String userLastName ){

        this.userId = counter++;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;

    }

    public User(){} //to be able to see which User has the bike

    public int getUserId(){
        return this.userId;
    }

    public String getUserFirstName(){
       return this.userFirstName= userFirstName;
    }

    public void setUserFirstName(){
        this.userFirstName=userFirstName;
    }

    public String getUserLastName(){
        return this.userLastName;
    }
    public void setUserLastName(){
        this.userLastName=userLastName;
    }
    public Integer getCurrRentedBike(){
        return this.currRentedBike;
    }
    public void setCurrRentedBike(Integer bikeId){ //to be able to see which user has which bike - pass bikeId
        this.currRentedBike=bikeId;
    }

    public void rentABike( Integer bikeId){
        if(Main.bikes.get(bikeId).getaStatus()== Bike.Status.CanBeRented){
            Main.checkStation(bikeId);
            this.currRentedBike = bikeId;
            GregorianCalendar today = (GregorianCalendar) Calendar.getInstance();
            this.rent = new Rent(bikeId, today);
            this.rents.add(this.rent);
        }else{
            System.out.println("This bike can't be rented, sorry!");
        }
    }

    public void removeBike(Integer bikeId){ //when user returns bike set currently rented bike to 0
        this.currRentedBike = null;
    }

    }



