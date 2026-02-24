import java.util.*;

/*
TODO: 
advance cars
    check passengers
    check car
toStrings
*/

public class Rideshare {
    public static void main(String[] args) {
        Road theRoad = new Road();

        ArrayList<Passenger> passengerActiveList = new ArrayList<Passenger>();
        for(int i = 0; i < 50; i++){
            passengerActiveList.add(new Passenger());
            theRoad.addPassengerStation(i, passengerActiveList.get(i));
        }

        ArrayList<Car> carActiveList = new ArrayList<Car>();
        //CHANGE I BOUNDS TO CHANGE NUMBER OF CARS
        //TODO: WRITE INPUT SYSTEM??
        for(int i = 1; i <= 30; i++){
            carActiveList.add(new Car());
        }
        
        ArrayList<Car> carCompletedList = new ArrayList<Car>();

        ArrayList<Station> stationMasterList = new ArrayList<Station>();
        for(int i = 1; i <= 32; i++){
            stationMasterList.add(new Station(i));
        }
    }
}
