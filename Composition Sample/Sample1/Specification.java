
package ObjectOriented;

public class Specification {
    private int ram;
    private int rom;
    private int batteryDurability;
    private String version;
    
    public Specification(int ram,int rom,int batteryDurability,String version ){
        this.ram=ram;
        this.rom=rom;
        this.batteryDurability=batteryDurability;
        this.version=version;
    }
    public int getRam(){
        return this.ram;
    }
    public int getRom(){
        return this.rom;
    }
    public int batteryDurability(){
        return this.batteryDurability;
    }
    public String getVersion(){
        return this.version;
    }
    
  
}
