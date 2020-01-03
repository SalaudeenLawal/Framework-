
package ObjectOriented;

class car{
    private String name;
    private int engine;
    private int cylinder;
    private boolean isAutomatic;
    private int wheel;
    public final String alert1="Brakepad is effective";
    public final String alert2="Brakepad is faulty";
    
    public car( String name,int cylinder){
        this.cylinder=cylinder;
        this.name=name;
        this.engine=1;
        this.wheel=4;
        this.isAutomatic=true;
    }
    public String getName(){
        return this.name;
    }
    public int getEngine(){
        return this.engine;
    }
    public int getCylinder(){
        return this.cylinder;
    }
    public boolean getIsAutomatic(){
        return this.isAutomatic;
    }
    public int getWheel(){
        return this.wheel;
    }
    public String startEngine(){
        return "Car at Neutral State";
    }
    public boolean Accelerator(){
        return true;
    }
    public String Brake(){
        return alert1;
    }
}
class Venza extends car{

    public Venza() {
        super("Venza",2 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:1";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert2;
    }
}
class Lexus extends car{

    public Lexus() {
        super("Lexus",2 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:2";
    }
    @Override
    public boolean Accelerator(){
        return false;
    }
    @Override
    public String Brake(){
        return alert1;
    }
}
class Corolla extends car{

    public Corolla() {
        super("Venza",1 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:4";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert1;
    }
}class Highlander extends car{

    public Highlander() {
        super("HighLander",2 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:3";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert1;
    }
}
class Rav4 extends car{

    public Rav4() {
        super("Rav4",1 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:2";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert2;
    }
}
class Royce extends car{

    public Royce() {
        super("Royce",2 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:5";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert1;
    }
}
class Landcrusier extends car{

    public Landcrusier() {
        super("Landcrusier",2 );
    }
    @Override
    public String startEngine(){
        return "Engine started. current gear:4";
    }
    @Override
    public boolean Accelerator(){
        return true;
    }
    @Override
    public String Brake(){
        return alert1;
    }
}

public class Motors {
    public static void main(String args[]){
        for (int x=1; x<20; x++){
            car vech= randomCars();
            
            System.out.println("Car No "+ x + ":" 
                    + vech.getName()+ "\n" + "Automatic Status: "
                    + vech.getIsAutomatic() + "\n" + "Number of Engine and Wheel: "+ vech.getEngine()
                    + "," + vech.getWheel() + "\n" +
                    "Cylinder Status: " + vech.getCylinder() + "\n" +
                    "Velocity Rate: " + vech.startEngine() + "\n" + "Acceleraror Status: " +
                    vech.Accelerator() + "\n" + "Brake Status: " + vech.Brake() + "\n");
       
        }
    }
    public static car randomCars(){
        int randomVech= (int)(Math.random()*7)+1;
        
        System.out.println("Assigned Random Number is: "+ randomVech);
        
        switch(randomVech){
            case 1:
                return new Venza();
            case 2:
                return new Lexus();
            case 3:
                return new Corolla();
            case 4:
                return new Highlander();
            case 5:
                return new Rav4();
            case 6: 
                return new Landcrusier();
            case 7:
                return new Royce();
            default:
                return null;
        }
    }
}
