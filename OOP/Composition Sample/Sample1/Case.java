
package ObjectOriented;

public class Case {
    private String model;
    private String manufacturer;
    private Specification spec;
    private boolean volumeOn;
    private boolean powerButton;
    
    public Case(String model, String maufacturer,Specification spec,boolean volumeOn,boolean powerButton){
        this.model=model;
        this.manufacturer=manufacturer;
        this.spec=spec;
        this.volumeOn=true;
        this.powerButton=true;
    }
      public String getModel(){
          return this.model;
        }
      public String getMaufacturer(){
          return this.manufacturer;
      }
      public Specification getSpecification(){
          return this.spec;
      }
      public Boolean getVolume(){
          return this.volumeOn;
      }
      public Boolean getPowerButton(){
          return this.powerButton;
      }
      
}
