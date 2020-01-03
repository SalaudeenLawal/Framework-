
package ObjectOriented;

public class myLaptop {
    private MotherBoard panel;
    private Monitor screen;
    private Resolution size;
    private Case myCase;
    private Specification mySpec;
    
    public myLaptop(MotherBoard panel,Monitor screen,Resolution size,Case myCase,Specification mySpec){
        this.panel=panel;
        this.screen=screen;
        this.size=size;
        this.myCase=myCase;
        this.mySpec=mySpec;
    }
    public MotherBoard getPanel(){
        return this.panel;
    }
    public Monitor getScreen(){
        return this.screen;
    }
    public Resolution getSize(){
        return this.size;
    }
    public Case myCase(){
        return this.myCase;
    }
    public Specification getMySpec(){
        return this.mySpec;
    }
    
}
