
package inheritance;
/*Class Car with public access modifier inherit some behavior
and property fron it base class Vechicle
*/
public class Car extends Vechicle{
   // create field variables for class Car
    private int door;
    private int steering;
    private int wipepers;        
    private String gearType;
    private int gear;
    //create Car constructor added with the base constructor argument and set the Car field variables
    public Car(String name, String color,int speedRate, int door, int steering,int wipepers,String gearType,int gear) {
        
        super(name, color, 4, 1, 1, speedRate);
        gear= 0;
        this.door=door;
        this.steering=steering;
        this.wipepers=wipepers;
        this.gearType=gearType;
        this.gear=gear;
                       
    }
    // create getter for the field variables
    public int getDoor(){
        return door;
    }
    public int getSteering(){
        return steering;
    }
    public int getWipepeers(){
        return wipepers;
    }
    public String getGearType(){
        return gearType;
    }
    // override the move() method in the base call
    @Override
    public void move(int speed){
        move(speed);
    }
    //create the method gearstate() to handle the gear
    public void gearState(int gearstate){
        gear=gearstate;  
        System.out.println("You Change the car gear to: "+gear);
    }
    
    
}
