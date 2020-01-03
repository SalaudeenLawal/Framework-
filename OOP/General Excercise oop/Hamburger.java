
package ObjectOriented;

public class Hamburger {
    private String name;
    private boolean meat;
    private String rollType;
    private double price;
    private String itemsAddName;
    private double itemsAddPrice;
    private String itemsAddName1;
    private double itemsAddPrice1;
    private String itemsAddName2;
    private double itemsAddPrice2;
    private String itemsAddName3;
    private double itemsAddPrice3;
    
    public Hamburger(String name, boolean meat, String rollType, double price){
        this.name=name;
        this.meat=meat;
        this.rollType=rollType;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public boolean getMeat(){
        return meat;
    }
    public String getRollType(){
        return this.rollType;
    }
    public double getPrice(){
        return price;
    }
    
    public void itemsAdd(String name,double price){
        this.itemsAddName=name;
        this.itemsAddPrice=price;
    }
    public void itemsAdd1(String name, double price){
        this.itemsAddName1=name;
        this.itemsAddPrice1=price;
    }
    public void itemsAdd2(String name, double price){
        this.itemsAddName2=name;
        this.itemsAddPrice2=price;
    }
    public void itemsAdd3(String name, double price){
        this.itemsAddName3=name;
        this.itemsAddPrice3=price;
    }
    
    public double itemsAddHandling(){
        double priceHandling=this.price;
        if(this.itemsAddName != null){
            priceHandling+=itemsAddPrice;
            System.out.println(this.itemsAddName+" Add with an extra price of "+this.itemsAddPrice);
        }
        if(this.itemsAddName1!=null){
            priceHandling+=itemsAddPrice1;
            System.out.println(this.itemsAddName1+" Add with an extra price of "+this.itemsAddPrice1);
        }
        if(this.itemsAddName != null){
            priceHandling+=itemsAddPrice2;
        System.out.println(this.itemsAddName2+" Add with an extra price of "+this.itemsAddPrice2);
        }
        
        if(this.itemsAddName1!=null){
            priceHandling+=itemsAddPrice3;
            System.out.println(this.itemsAddName3+" Add with an extra price of "+this.itemsAddPrice3);
        }
        return priceHandling;
    }
    
}
