import java.util.*;

/*
TODO: 
check system (not working)
toStrings
*/

public class Rideshare {
    public static void main(String[] args) {
        Road theRoad = new Road(30);

        //makes all passengers
        ArrayList<Passenger> passengerMasterList = new ArrayList<Passenger>();
        for(int i = 0; i < 50; i++){
            passengerMasterList.add(new Passenger());
            theRoad.addPassengerStation(i, passengerMasterList.get(i));
        }

        while(true){
            boolean allArrived = true;
            for(Car a : theRoad.getCarList()){
                if(!a.getArrived()){
                    allArrived = false;
                    break;
                }
            }
            if(allArrived){
                break;
            }
            theRoad.advanceAllCars();
        }

        int completedCountMasterList = 0;
        for(Passenger a : passengerMasterList){
            if(a.getArrivedPassenger()){
                completedCountMasterList++;
            }
        }

        System.out.println("Completed Count by master list: " + completedCountMasterList);

        int completedCountStationList = 0;
        for(Station a : theRoad.getStationList()){
            for(Passenger b : a.getCompletedPassengerList()){
                if(b.getArrivedPassenger()){
                    completedCountStationList++;
                }
            }
        }

        System.out.println("Completed Count by station list: " + completedCountStationList);
    }
}
