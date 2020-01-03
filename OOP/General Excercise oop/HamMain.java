
package ObjectOriented;

public class HamMain {
    public static void main(String args[]){
        Hamburger burger= new Hamburger("Healthy",true,"fish_roll",20.50);
        burger.itemsAdd("HotDog", 45.6);
        System.out.println(burger.itemsAddHandling());
        
        HealthyBurger Hburger= new HealthyBurger(false,10.7);
        Hburger.getHealthyBurgerName("HotDog", 57.3);
        
        System.out.println(Hburger.itemsAddHandling());
        
        DeluxeHamburger deluxe= new DeluxeHamburger();
        deluxe.itemsAdd("egg", 10.0);
        System.out.println(deluxe.itemsAddHandling());
        
    }
}
