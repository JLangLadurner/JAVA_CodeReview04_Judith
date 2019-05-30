package cityBike;

import java.util.ArrayList;

public class User {

    static int counter;

    public String userId;
    public String userFirstName;
    public String userLastName;
    public String userEmail;
    public String userPass;
    ArrayList<String> userRentBike;

    User (String userFirstName, String userLastName, String userEmail, String userPass){
        counter++;
        this.userId = "userId"+counter;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPass = userPass;
        ArrayList<String>userRentBike = new ArrayList<>();
    }

    //adds bikes to User
    public void setUsrBikes(String bikeId){
        userRentBike.add(bikeId);
    }

}
