
public class Main {
    public static void main(String args[]){
        Dimension dimension= new Dimension(50.56,60.78);
       
	 Bed bed= new Bed(1,"Scanfroast","Orange");
       
	 Chair chair=new Chair(3,"Scanfroast","Cream");
       
	 Furniture furniture=new Furniture(bed,chair);
       	
	 Ceiling ceiling =new Ceiling(dimension,"white");
        
	Room myRoom=new Room("Bedroom","Pink",furniture,chair,bed,ceiling,dimension);
        
	myRoom.myRoomBed();
        myRoom.myRoomDimension();
    }
}
