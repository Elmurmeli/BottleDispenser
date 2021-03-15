public class bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;

    public bottle() {
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        price = 1.80;
    }

    public bottle(String _name, String _manufacturer, double _total_energy, double _size, double _price) {
        name = _name;
        manufacturer = _manufacturer;
        total_energy = _total_energy;
        size = _size;
        price = _price;
    }
    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getEnergy(){
        return total_energy;
    }
    public double getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
}