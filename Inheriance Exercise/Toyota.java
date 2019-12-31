
package inheritance;


public class Toyota extends Car{
     private boolean nitro;

    public Toyota(String name,String color,int speedRate,String gearType,int gear) {
        
        super("Venza" ,color, speedRate, 4, 1, 2,"automatic.", gear);
        this.nitro=true;
    }
    public boolean getNitro(){
        return this.nitro;
    }
    public void controller(int rate){
      int speedController= getSpeedRate()+rate;  
      if(speedController>0){
        move(speedController);
    }
      if (speedController<0){
          stop();
          gearState(0);
      }
      else if (speedController>0&&speedController<=15){
          gearState(1);
      }
      else if(speedController>15&&speedController<35){
        gearState(2);
      }
      else if(speedController>35&&speedController<55){
          gearState(3);
      }
      else if(speedController>55&&speedController<80){
          gearState(4);
      }
      else if(speedController>80&&speedController<=100){
          gearState(5);
      }else{
          System.out.println("Alert: You have reach the last gear");
      }
    }
}
