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

        System.out.print("a");



        int x = 3;
        System.out.println("Before change by value:" + x);
        passMethod(x);
        System.out.println("Aftef change by value:" + x);             // 3

        Transform tmp11 = new Transform(10);
        System.out.println("Before class change" + tmp11.getData());
        passMethod(tmp11);
        System.out.println("After class change" + tmp11.getData());   // 222
    }
    public static void passMethod (int p) {
        p = 10;
    }
    public static void passMethod(Transform tmp){
        tmp.setData(2222);
       // tmp = new Transform();
    }
}
/**         Check it!
 *  public void moveCircle(Circle circle, int deltaX, int deltaY) {
 // code to move origin of circle to x+deltaX, y+deltaY
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);

 // code to assign a new reference to circle
    circle = new Circle(0, 0);
    }
 Let the method be invoked with these arguments:

 moveCircle(myCircle, 23, 56)*/
class Transform{
    private int data;

    Transform(int p){
        data = p;
    }
    Transform(){
    }
    public void setData(int newValue){
        data = newValue;
    }
    public int getData(){
        return data;
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
