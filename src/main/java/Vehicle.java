import java.util.ArrayList;

public abstract class Vehicle {
    Double price;
    String colour;
    ArrayList<IComponent> components;

    public Vehicle(Double price, String colour, ArrayList<IComponent> componentParts) {
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList<>();
        for (IComponent component : componentParts){
            this.components.add(component);
        }
    }

    public ArrayList<IComponent> getComponents() {
        return this.components;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String startEngine(){
        return "Frroom, Frroom";
    }


//    public abstract String reFuel();

    public ArrayList<FuelTank> getFuelTanks(){
        ArrayList<FuelTank> results = new ArrayList<>();
        for (IComponent component : this.components){
            if (component instanceof FuelTank){
                results.add((FuelTank) component);
            }
        }
        return results;
    }

    public void drive(int distance){
        ArrayList<FuelTank> fueltanks = this.getFuelTanks();
        fueltanks.get(0).useFuel(distance);
    }

    public String reFuel(){
        ArrayList<FuelTank> fueltanks = this.getFuelTanks();
        fueltanks.get(0).refillFuel();
        return "";
    }

}
