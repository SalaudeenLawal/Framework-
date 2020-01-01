
package ObjectOriented;

public class Mains {
    public static void main(String args[]){
        MotherBoard motherboard = new MotherBoard("Elitebook","Hp",4,1);
        Resolution resolution= new Resolution(34,30);
        Monitor monitor=new Monitor("Elitebook","Hp",25,resolution);
        Specification specification=new Specification(4,500,1000,"core i5");
        Case myCase= new Case("Elitebook","Hp",specification,true,true);
        myLaptop pc=new myLaptop(motherboard,monitor,resolution,myCase,specification);
       
       pc.getPanel().alertMessage();
    }
}
