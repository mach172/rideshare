import java.util.*;

public class Car {
    private ArrayList<Passenger> passengerList;
    private int direction;
    private int location;
    private int destination;
    private boolean arrived;
    private int id;
    private static int idGen = 1;

    public Car(){
        passengerList = new ArrayList<Passenger>();
        location = (int)(Math.random() * 32 + 1);
        destination = (int)(Math.random() * 32 + 1);
        arrived = false;
        while(destination == location){
            destination = (int)(Math.random() * 32 + 1);
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
            location += direction;

            if(location == destination){
                arrived = true;
            }
        }
    }

    public int getLocationCar(){
        return location;
    }

    public int getDestination(){
        return destination;
    }

    public int getPassengerCount(){
        return passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }

    public boolean getArrived(){
        return arrived;
    }

    public void removePassenger(Passenger a){
        passengerList.remove(a);
    }

    public int getIdCar(){
        return id;
    }

    public int getDirection(){
        return direction;
    }

    public void addPassengerCar(Passenger a){
        passengerList.add(a);
    }

    public String toString(){
        String s = "ID: " + id + ", Location: " + location + ", Destination: " + destination + ", Arrived: " + arrived + "\nPassenger List:";
        for(Passenger a : passengerList){
            s += "\n" + a.toString();
        }
        return s;
    }
}
