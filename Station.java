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
        if(passengerList.size()>0){
            boolean checkCompleted = false;
            while(!checkCompleted){
                for(int i = passengerList.size()-1; i >= 0; i--){
                    for(Car b : carList){
                        if(b.getPassengerCount() < 3){
                            if((passengerList.get(i).getDestinationPassenger() > location) && (b.getDirection() == 1)){
                                //TODO when one a passenger is added/removed from the passengerList, it changes the size but it has no affect on the for(i) loop leading to an IndexOutOfBoundsException
                                b.addPassengerCar(passengerList.get(i));
                                passengerList.remove(passengerList.get(i));
                            }
                        }
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

    public ArrayList<Passenger> getCompletedPassengerList(){
        return completedPassengers;
    }
}
