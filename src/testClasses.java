/**
 * Created by Sebastian on 25.04.2017.
 */
public class testClasses {
    public static void main(String[] args){
        Bicycle tmp1 = new Bicycle(2,50);
        MountainBike tmp2 = new MountainBike(30, 5,40);

        tmp1.setSpeed(3,4);

    }
}

class Bicycle{
    private int gear;
    private int speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue){
        gear = newValue;
    }
    public void setSpeed(int newValue){
        speed = newValue;
    }
    public void setSpeed(int newValue, int newValue2){
        speed = newValue+newValue2;
    }
    public int getGear(){
        return gear;
    }
    public int getSpeed(){
        return speed;
    }
}

class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int startHeight, int startGear, int startSpeed) {
        super(startGear, startSpeed);
        seatHeight = startHeight;
    }

        public void setHeight(int newValue){
            seatHeight = newValue;
        }

        public int getSeatHeight(){
            return seatHeight;
        }
}
