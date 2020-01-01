
public class Room {
    private String name;
    private String color;
    private Furniture furniture;
    private Chair chair;
    private Bed bed;
    private Ceiling ceiling;
    private Dimension dimension;
    
    public Room(String name,String color,Furniture furniture,Chair chair,Bed bed, Ceiling ceiling, Dimension dimension){
        this.name=name;
        this.color=color;
        this.furniture=furniture;
        this.chair= chair;
        this.bed=bed;
        this.ceiling=ceiling;
        this.dimension=dimension;
    }   
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public Chair getChair(){
        return this.chair;
    }
    public Bed getBed(){
        return this.bed;
    }
    public Ceiling getCeling(){
        return ceiling;
    }
    public void myRoomBed(){
       bed.myBed();
    }
    public void myRoomDimension(){
        dimension.roomDimension();
    }
}
