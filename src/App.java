import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CarRepository baza = new CarRepository();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println("1. List Cars");
            System.out.println("2. Rent Car");
            System.out.println("3. Exit");

            switch(scanner.nextLine()) {
                case "1":
                    for(Car car : baza.cars) {
                        System.out.println(
                                car.brand + " "
                                + car.model + " "
                                + car.price + " "
                                + car.plate + " "
                                + car.rent);
                    }
                    break;
                case "2":
                    System.out.println("Enter car plate:");
                    if(baza.rentCar(scanner.nextLine())) {
                        System.out.println("Success !!");
                    } else {
                        System.out.println("Error !!");
                    }
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("Incorrect choose");
                    break;
            }
        }
    }
}
