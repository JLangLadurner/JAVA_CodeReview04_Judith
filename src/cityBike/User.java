package cityBike;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {


    public static Integer counter =1;
    public Integer userId;//id was not defined as integer according to assignment
    public String userFirstName;
    public String userLastName;
    public String userEmail;

    ArrayList<String> userRentBike;

    User (String userFirstName, String userLastName, String userEmail ){

        this.userId = counter++;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        ArrayList<String>userRentBike = new ArrayList<>();
    }


    }


