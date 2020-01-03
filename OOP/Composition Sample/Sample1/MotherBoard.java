
package ObjectOriented;

public class MotherBoard {
    private String model;
    private String manfacturer;        
    private int usbSlot;
    private int ramSlot;
    
    public MotherBoard(String model,String manufacturer,int usbSlot,int ramSlot){
        this.manfacturer=manufacturer;
        this.model= model;
        this.ramSlot= ramSlot;
        this.usbSlot= usbSlot;
    }
    public String getModel(){
        return this.model;
    }
    public String getManufacturer(){
        return this.manfacturer;
   }
   public int getUsbSlot(){
       return this.usbSlot;
   }
   public int getRamSlot(){
       return this.getUsbSlot();
   }
   public void alertMessage(){
       System.out.println("MotherBoard model is: "+model);
   }
}
