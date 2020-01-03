
public class Dimension {
    private Double weight;
    private Double height;
    
    public Dimension(Double weight,Double height){
        this.weight=weight;
        this.height=height;
    }
    public Double getWeight(){
        return this.weight;
    }
    public Double getHeight(){
        return this.height;
    }
    public void roomDimension(){
        System.out.println("My room dimension is "+weight+" meters by weight and "+height+" meters by height");
    }
}
