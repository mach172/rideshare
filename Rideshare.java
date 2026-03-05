import java.util.*;

public class Rideshare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the rideshare simulation");

        while(true){
            int completedCountMasterList20 = 0;
            int completedCountMasterList40 = 0;

            for(int e = 20; e <= 40; e+= 20){
                Road theRoad = new Road(e);

                //makes all passengers
                ArrayList<Passenger> passengerMasterList = new ArrayList<Passenger>();
                for(int i = 0; i < 50; i++){
                    passengerMasterList.add(new Passenger());
                    theRoad.addPassengerStation(passengerMasterList.get(i).getStartPassenger(), passengerMasterList.get(i));
                }

                //runs simulation
                while(true){
                    System.out.println(theRoad.toString() + "\n");
                    
                    theRoad.advanceAllCars();

                    boolean allArrived = true;
                    for(Car c : theRoad.getCarList()){
                        if(!c.getArrived()){
                            allArrived = false;
                            break;
                        }
                    }

                    if(allArrived){
                        break;
                    }
                }

                //counts completed trips
                for(Passenger a : passengerMasterList){
                    if(a.getArrivedPassenger()){
                        if(e == 20){
                            completedCountMasterList20++;
                        }
                        else if(e == 40){
                            completedCountMasterList40++;
                        }
                    }
                }
            }
            System.out.println("\nSimulations completed\n");
            System.out.println("20 Car simulation results:");
            System.out.println("Passenger trips completed: " + completedCountMasterList20 + "/50");
            System.out.println("Percentage of trips complete: " + ((double)completedCountMasterList20/50 * 100) + "%\n");

            System.out.println("40 Car simulation results:");
            System.out.println("Passenger trips completed: " + completedCountMasterList40 + "/50");
            System.out.println("Percentage of trips complete: " + ((double)completedCountMasterList40/50 * 100) + "%\n");

            System.out.println("Select option:");
            System.out.println("1) Run simulations again");
            System.out.println("2) Close program");
            System.out.println("Enter choice:");
            int choice = input.nextInt();
            if(choice == 2){
                break;
            }
        }

        input.close();
    }
}
