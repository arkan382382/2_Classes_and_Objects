/**
 * Created by Sebastian on 25.04.2017.
 */
public class testClasses {
    public static void main(String[] args){
        Bicycle tmp1 = new Bicycle(2,50);
        MountainBike tmp2 = new MountainBike(30, 5,40);

        tmp1.setSpeed(3,4);

        Bicycle a = new Bicycle();
        Bicycle aa = new Bicycle(2,3);
        Bicycle aaa = new Bicycle(1,2,3);
    }
}

class Bicycle{
    private int gear;
    private int speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }
    public Bicycle(){
        gear = 3;
        speed = 23;
    }
    public Bicycle(int a, int b, int c){
        gear = a+2;
        speed = a*c+b;
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

//https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
//https://www.youtube.com/watch?v=btFfXgUdIzY&list=RDmQR0bXO_yI8&index=3

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
