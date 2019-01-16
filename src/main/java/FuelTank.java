public class FuelTank implements IComponent {

    int capacity;

    public FuelTank() {
        this.capacity = 100;
    }

    public int getCapacity() {
        return capacity;
    }

    public void useFuel(int used) {
        this.capacity -= used;
    }

    public void refillFuel(){
        this.capacity = 100;
    }

    public String hasA(){
        return "This has a component " + this.getClass();
    }
}
