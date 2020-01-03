
package inheritance;

public class Vechicle {
    //create field/instance variables for the class vechicle
    private String name; 
    private String color;
    private int tyre;
    private int engine;
    private int accelerator;
    private int speedRate;
   //create the constructor and set the of each of the field variable declare
    public Vechicle(String name, String color, int tyre, int engine, int accelerator, int speedRate){
        speedRate=0; //assign the default speedRate to be zero
        this.name=name;
        this.color=color;
        this.tyre=tyre;
        this.engine=engine;
        this.accelerator=accelerator;
        this.speedRate=speedRate;
    }
    //create getter for each of the instance variable
    public String getName(){
        return this.name;
    }
   public String getColor(){
    return this.color;
   }
   public int getTyre(){
       return this.tyre;
   }
    public int getEngine(){
        return this.engine;
    }
   public int getAccelerator(){
       return this.accelerator;
   }
   public int getSpeedRate(){
       return this.speedRate;
   }
   // create method mov() to handle the car movement
   public void move(int speed){
       speedRate+=speed;
       System.out.println("The Current speed of the car is: "+speedRate);
   }
   //create method stop() that send the car back to it default state(0) after stoping
   public void stop(){
       speedRate=0;
       System.out.println("You called the stop control");
   }
}
   

