
public class Chair {
    private int chair;
    private String type;
    private String color;
    
    public Chair(int chair,String type,String color){
        this.chair=chair;
        this.type=type;
        this.color=color;
    }
    public int getChair(){
        return this.chair;
    }
    public String getType(){
        return this.type;
    }
    public String getColor(){
        return this.color;
    }
}
