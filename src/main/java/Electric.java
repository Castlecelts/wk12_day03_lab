import java.util.ArrayList;

public class Electric extends Vehicle{


    public Electric(Double price, String colour, ArrayList<IComponent> componentParts) {
        super(price, colour, componentParts);
    }

    public String reFuel(){
        super.reFuel();
        return "BZZZZZZZ";
    }
}
