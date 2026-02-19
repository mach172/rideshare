import java.util.*;

public class Car {
    private ArrayList<Passenger> passengerList;
    private int direction;
    private int location;
    private int destination;
    private boolean arrived;
    private int id;
    private static int idGen = 0;

    public Car(){
        passengerList = new ArrayList<Passenger>();
        location = (int)(Math.random() * 32 + 1);
        destination = (int)(Math.random() * 32 + 1);
        arrived = false;
        while(destination == location){
            location = (int)(Math.random() * 32 + 1);
        }
        id = idGen;
        idGen++;
        if(location < destination){
            direction = 1;
        }
        else{
            direction = -1;
        }
    }

    public void advanceCar(){
        if(!arrived){
            for(Passenger a : passengerList){
                a.movePassenger(direction);
                if(a.getDestinationPassenger() == a.getLocationPassenger()){
                    a.isArrived();
                    passengerList.remove(a);
                }
            }
            location++;
            if(location == destination){
                arrived = true;
            }
        }
    }

    public int getLocationCar(){
        return location;
    }

    public int getPassengerCount(){
        return passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }
}
