public class Tyre implements IComponent{
    private String brand;
    private String type;

    public Tyre(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String hasA(){
        return "This is a component " + this.getClass();
    }
}
