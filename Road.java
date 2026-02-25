import java.util.*;

public class Road {
    private ArrayList<Station> stationList;
    private ArrayList<Car> carList;

    public Road(int carNumber){
        stationList = new ArrayList<Station>();
        for(int i = 1; i <= 32; i++){
            stationList.add(new Station(i));
        }

        carList = new ArrayList<Car>();
        for(int i = 1; i <= carNumber; i++){
            carList.add(new Car());
        }
    }
    
    public void addPassengerStation(int station, Passenger passIn){
        for(Station a : stationList){
            if(a.getLocation() == station){
                a.addPassenger(passIn);
            }
        }
    }

    public void advanceAllCars(){
        for(Car a : carList){
            if(!a.getArrived()){
                //checks if passenger is at stop
                for(Passenger b : a.getPassengerList()){
                    if(a.getLocationCar() == b.getDestinationPassenger()){
                        b.passengerIsArrived();
                        for(Station c : stationList){
                            if(b.getLocationPassenger() == c.getLocation()){
                                c.addPassenger(b);
                            }
                        }
                        a.removePassenger(b);
                    }
                }
                a.advanceCar();
                //removes all passengers if car is at stop
                if(a.getArrived()){
                    for(Station c : stationList){
                        if(c.getLocation() == a.getLocationCar()){
                            for(Passenger d : a.getPassengerList()){
                                c.addPassenger(d);
                                a.removePassenger(d);
                            }
                        }
                    }
                }
            }
        }
        //checks passengers at station
        for(Station a : stationList){
            a.checkPassengers(carList);
        }
    }

    public ArrayList<Station> getStationList(){
        return stationList;
    }

    public ArrayList<Car> getCarList(){
        return carList;
    }
}
