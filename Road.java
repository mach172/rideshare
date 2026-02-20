import java.util.*;

public class Road {
    private ArrayList<Station> stationList;
    private ArrayList<Car> carList;

    public Road(){
        stationList = new ArrayList<Station>();
        for(int i = 1; i <= 32; i++){
            stationList.add(new Station(i));
        }

        carList = new ArrayList<Car>();
        for(int i = 1; i <= 30; i++){
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
        
    }
}
