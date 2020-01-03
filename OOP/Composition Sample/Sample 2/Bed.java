
public class Bed {
     private int bed;
    private String type;
    private String color;
    
    public Bed(int bed,String type,String color){
        this.bed=bed;
        this.type=type;
        this.color=color;
    }
    public int getBed(){
        return this.bed;
    }
    public String getType(){
        return this.type;
    }
    public String getColor(){
        return this.color;
    }
    public void myBed(){
        System.out.println("This is my Master Bedroom with "+bed+"Bed and it's a product of "+type+","+color+ "color");
    }
}

