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

    public boolean getArrived(){
        return arrived;
    }

    public int getDestination(){
        return destination;
    }

    public int getLocation(){
        return location;
    }

    public int getId(){
        return id;
    }

    public void move(int direction){
        location += direction;
    }
}
