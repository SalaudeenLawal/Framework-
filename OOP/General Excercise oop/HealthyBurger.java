
package ObjectOriented;

public class HealthyBurger extends Hamburger{
        private String healthyBurgerName1;
        private double healthyBurgerPrice1;
         private String healthyBurgerName2;
        private double healthyBurgerPrice2;
        
    public HealthyBurger( boolean meat, double price){
        super("Hamburger", meat, "fish", price);
    }
    
    public void getHealthyBurgerName(String name,double price){
         this.healthyBurgerName1=name;
         this.healthyBurgerPrice1=price;
    }
    public void getHealthyBurgerprice(String name,double price){
        this.healthyBurgerName2=name;
        this.healthyBurgerPrice2=price;
    }
    
    @Override
    public double itemsAddHandling(){
        double defaultPrice= super.itemsAddHandling();
        
        if(this.healthyBurgerName1!=null){
            defaultPrice+=this.healthyBurgerPrice1;
        }
        if(this.healthyBurgerName2!=null){
            defaultPrice+=this.healthyBurgerPrice2;
        }
        return defaultPrice;
    }
}
