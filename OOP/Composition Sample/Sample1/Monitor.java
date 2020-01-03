
package ObjectOriented;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution myResolution;
    
    public Monitor(String model, String manufacturer, int size,Resolution myResolution){
        this.model=model;
        this.manufacturer= manufacturer;
        this.size=size;
        this.myResolution=myResolution;
    }
    public String getModel(){
        return this.model;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public int getSize(){
        return this.size;
    }
    public Resolution getResolution(){
        return this.myResolution;
    }
   public void pixel(int x,int y,String color){
       System.out.println("Pixel x: "+x+","+"Pixel y: "+y+","+"Color: "+color);
}
}
