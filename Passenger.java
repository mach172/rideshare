public class Passenger {
    private int destination;
    private int id;
    private int start;
    private boolean arrived;
    private static int idGen = 1;

    public Passenger(){
        destination = (int)(Math.random() * 32 + 1);
        start = (int)(Math.random() * 32 + 1);
        id = idGen;
        while(destination == start){
            start = (int)(Math.random() * 32 + 1);
        }
        idGen++;
        arrived = false;
    }

    public int getDestinationPassenger(){
        return destination;
    }

    public int getStartPassenger(){
        return start;
    }

    public int getIdPassenger(){
        return id;
    }

    public boolean getArrivedPassenger(){
        return arrived;
    }

    public void passengerIsArrived(){
        arrived = true;
    }

    public String toString(){
        return "ID: " + id + ", Destination: " + destination + ", Start: " + start + ", Arrived: " + arrived;
    }
}
