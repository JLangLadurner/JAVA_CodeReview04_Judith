package cityBike;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {


    private static Integer counter =1;
    private Integer userId;
    private String userFirstName;
    private String userLastName;


    ArrayList<String> userRentBike;

    User (String userFirstName, String userLastName, String userEmail ){

        this.userId = counter++;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;

        ArrayList<String>userRentBike = new ArrayList<>();
    }

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
}


