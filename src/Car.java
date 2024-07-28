public class Car {
    String brand;
    String model;
    double price;
    boolean rent;
    String plate;

    public Car(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rent = false;
        this.plate = plate;
    }

    public Car() {
    }
}
