
package ObjectOriented;

class University{
    private String name;
    
    public University(String name){
        this.name=name;
    }
    public String getUniversityName(){
        return this.name;
    }
    
    public String Description(){
        return "No Default Description";
    }
}
class FutMinna extends University{

    public FutMinna() {
        super("Futminna");
    }
    @Override
    public String Description(){
        return "Technology for Empowerment";
    }
}
class Lautech extends University{

    public Lautech() {
        super("Lautech");
    }
    @Override
    public String Description(){
        return "Excellence,Integrity,and Service";
    }
}
class UI extends University{

    public UI() {
        super("UI");
    }
    @Override
    public String Description(){
        return "To Think Straight is the Fount of Knowledge";
    }
}
class Futa extends University{

    public Futa() {
        super("Futa");
    }
    @Override
    public String Description(){
        return"Technology for Self Reliance";
    }
}
class UniIlorin extends University{

    public UniIlorin() {
        super("UniILorin");
    }
    @Override
    public String Description(){
        return"Probitas Doctrina";
    }
}
class KwaraPoly extends University{

    public KwaraPoly() {
        super("KwaraPoly");
    }
    //it's not a univeristy. thus, no description method
}

public class Morphism {
    public static void main(String args[]){
        for(int i=1; i<11;i++){
            University uni= randomSelect();
            
            System.out.println("University No: "+ i + ":" 
                    + uni.getUniversityName()+ "\n" +
                     "Description: "+uni.Description()+"\n");
        }
    }
    public static University randomSelect(){
        int RandomUni= (int)(Math.random()*6)+1;
        System.out.println("Random number generated was:"+ RandomUni);
        switch(RandomUni){
            case 1:
                return new FutMinna();
            case 2:
                return new Lautech();
            case 3:
                return new UI();
            case 4:
                return new Futa();
            case 5:
                return new UniIlorin();
            case 6:
                return new KwaraPoly();
            default:
                return null;
        }
        
    }
}
