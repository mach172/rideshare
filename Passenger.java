public class Passenger {
    private int destination;
    private int id;
    private int location;
    private boolean arrived;
    private static int idGen = 1;

    public Passenger(){
        destination = (int)(Math.random() * 32 + 1);
        location = (int)(Math.random() * 32 + 1);
        id = idGen;
        while(destination == location){
            location = (int)(Math.random() * 32 + 1);
        }
        idGen++;
        arrived = false;
    }

    public int getDestinationPassenger(){
        return destination;
    }

    public int getLocationPassenger(){
        return location;
    }

    public int getIdPassenger(){
        return id;
    }

    public void movePassenger(int direction){
        location += direction;
        if(location == direction){
            arrived = true;
        }
    }

    public boolean getArrivedPassenger(){
        return arrived;
    }

    public boolean checkArrived(){
        if(location == destination){
            arrived = true;
        }
        return arrived;
    }
}
