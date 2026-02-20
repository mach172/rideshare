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
        for(Passenger a : passengerList){
            for(Car b : carList){
                if(b.getPassengerCount() < 3){
                    if((a.getDestinationPassenger() < location) && (b.getDirection() == 1)){

                    }
                }
            }
        }
    }

    public void addPassenger(Passenger a){
        passengerList.add(a);
    }

    public int getLocation(){
        return location;
    }

    public void addCompletedPassenger(Passenger a){
        completedPassengers.add(a);
    }
}
