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
        for(Car a : carList){
            if(!a.getArrived()){
                if(a.getLocationCar() == location){
                    for(int i = 0; i < passengerList.size() && (a.getPassengerCount() < 3); ){
                        Passenger b = passengerList.get(i);

                        if((a.getDirection() == 1 && b.getDestinationPassenger() > location) ||
                        (a.getDirection() == -1 && b.getDestinationPassenger() < location)){
                            a.addPassengerCar(b);
                            passengerList.remove(i);
                        }
                        else{
                            i++;
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

    public String toString(){
        String s = "Location: " + location + "\nPassenger List:";
        for(Passenger a : passengerList){
            s += "\n" + a.toString();
        }
        s+= "\nCompleted passengers:";
        for(Passenger a : completedPassengers){
            s += "\n" + a.toString();
        }
        return s;
    }
}
