package cityBike;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    Station station4;
    User usr4;
    Bike bike9;


    @BeforeEach
    //create a new bike with bikeId 9;
    //create new station at new location
    //add bike to newly created station4
    //create new user 'usr4'

    void setUp() {
        bike9 = new Bike("black", Bike.Status.CanBeRented);
        Main.bikes.put(9,bike9);
        station4 = new Station("Schönbrunn");
        Main.stations.put(9,station4);
        station4.addBike(9);
        usr4 = new User("Mickey", "Mouse");

    }

    @Test
    void rentABike() {
        assertNull(usr4.getCurrRentedBike());
        assertEquals(1, station4.getBikes().size());
        usr4.rentABike(9);
        assertEquals(9,usr4.getCurrRentedBike());
        assertEquals(0,station4.getBikes().size());

    }
    //user 4 has initially no bikes
    //check if bike is in station 4
    //usr 4 rents bike
    //check that usr 4 has now the bike with the id 9
    //check that the station4 does not have the bike with id 9 anymore...

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUserId() {
    }

    @Test
    void getUserFirstName() {
    }

    @Test
    void setUserFirstName() {
    }

    @Test
    void getUserLastName() {
    }

    @Test
    void setUserLastName() {
    }

    @Test
    void getCurrRentedBike() {
    }

    @Test
    void setCurrRentedBike() {
    }



    @Test
    void removeBike() {
    }
}