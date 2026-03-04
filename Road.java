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
            a.advanceCar();
        }

        for(Car a : carList){
            for(int i = 0; i < a.getPassengerCount();){
                Passenger b = a.getPassengerList().get(i);
                if(b.getDestinationPassenger() == a.getLocationCar()){
                    b.passengerIsArrived();
                    for(Station c : stationList){
                        if(c.getLocation() == a.getLocationCar()){
                            c.addCompletedPassenger(b);
                            break;
                        }
                    }
                    a.getPassengerList().remove(i);
                }
                else{
                    i++;
                }
            }
        }

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

    public String toString(){
        String s = "Station list:";
        for(Station a : stationList){
            s += "\n" + a.toString();
        }
        s+= "\nCar list:";
        for(Car a : carList){
            s += "\n" + a.toString();
        }
        return s;
    }
}
