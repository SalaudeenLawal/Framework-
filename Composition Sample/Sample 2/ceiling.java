
public class Ceiling {
    private Dimension dimension;
    private String color;
    
    public Ceiling(Dimension dimension,String color){
        this.dimension=dimension;
        this.color=color;
    }
    public Dimension getDimension(){
        return this.dimension;
    }
    public String getColor(){
        return this.color;
    }
}
