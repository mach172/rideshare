import java.util.*;

public class Station {
    private ArrayList<Passenger> passengerList;
    private ArrayList<Passenger> completedPassengers;
    private int location;

    public Station(int locationIn){
        location = locationIn;
        passengerList = new ArrayList<Passenger>();
        completedPassengers = new ArrayList<Passenger>();
    }

    public void checkPassengers(ArrayList<Car> carList){
        
    }

    public void addPassenger(Passenger a){
        passengerList.add(a);
    }

    public int getLocation(){
        return location;
    }
}
