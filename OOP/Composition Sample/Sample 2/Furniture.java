
public class Furniture {
    private Bed myBed;
    private Chair myChair;
    
    public Furniture(Bed myBed,Chair myChair){
        this.myBed=myBed;
        this.myChair=myChair;
    }
    public Bed getBed(){
        return this.myBed;
    }
    public Chair getChair(){
        return this.myChair;
    }
}
