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
        arrived = false;
        while(destination == location){
            location = (int)(Math.random() * 32 + 1);
        }
        idGen++;
    }

    public boolean getArrivedPassenger(){
        return arrived;
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
    }

    public void isArrived(){
        arrived = true;
    }
}
