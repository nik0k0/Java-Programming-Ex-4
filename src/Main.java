public class Main {
    public static void main(String[] args) {
        // new RectangleArea().calculate();

        Car car = new Car ("Camry", "Toyota", 2023, 70000, "Black", 21);

        // Print car information before any changes
        System.out.println("Car information before any changes: ");
        System.out.println(car.toString());

        // Sell 7 cars
        car.sell(7);

        // Print using get methods
        System.out.println("\nModel: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        // Change some information using set method
        car.setModel("Land Cruiser");
        car.setColor("White");

        // Print car using toString() method
        System.out.println("\nCar information after some changes: ");
        System.out.println(car.toString());
    }
}