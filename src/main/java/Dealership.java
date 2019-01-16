import java.util.ArrayList;

public class Dealership {

    String name;
    int balance;
    ArrayList<Vehicle> vehicles;

    public Dealership(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.vehicles = new ArrayList<>();
    }



    public void transaction(Vehicle vehicle, Customer customer, Transactions type) {
        Double cost = vehicle.getPrice() * type.getRate();
    }


}
