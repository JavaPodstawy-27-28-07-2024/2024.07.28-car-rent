public class CarRepository {
    Car[] cars = new Car[5];

    CarRepository() {
        this.cars[0] = new Car("Toyota", "Corolla", 300.00, "KR11");
        this.cars[1] = new Car("Kia", "Ceed", 200.00, "KR22");
        this.cars[2] = new Car("Ford", "Mondeo", 350.00, "KR33");
        this.cars[3] = new Car("Fiat", "Panda", 200.00, "KR44");
        this.cars[4] = new Car("BMW", "5", 400.00, "KR55");
    }

    boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.plate.equals(plate) && !car.rent) {
                car.rent = true;
                return true;
            }
        }
        return false;
    }
}
