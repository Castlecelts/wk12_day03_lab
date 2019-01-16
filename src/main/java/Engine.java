public class Engine implements IComponent {
    private String size;
    private String manufacturer;

    public Engine(String size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String hasA(){
        return "This is a component " + this.getClass();
    }
}
