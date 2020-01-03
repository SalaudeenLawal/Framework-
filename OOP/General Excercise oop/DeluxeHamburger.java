
package ObjectOriented;

public class DeluxeHamburger extends Hamburger{
    
    public DeluxeHamburger() {
        super("Deluxe",true, "Sausage", 20.45);
        
        super.itemsAdd("chips", 10.0);
        super.itemsAdd1("drink", 10.0);
    }
    @Override
    public void itemsAdd(String name,double price){
        System.out.println("No Items Added");
    }
    @Override
    public void itemsAdd1(String name,double price){
        System.out.println("No Items Added");
    }
    @Override
    public void itemsAdd2(String name,double price){
        System.out.println("No Items Added");
    }
    @Override
    public void itemsAdd3(String name,double price){
        System.out.println("No Items Added");
    }
    
}
