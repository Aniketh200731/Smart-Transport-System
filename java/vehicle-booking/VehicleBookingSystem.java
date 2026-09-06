import java.util.Scanner;

public class VehicleBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle vehicle1 =
            new Vehicle(1, "TS09AB1234", "Bus", 15);

        Vehicle vehicle2 =
            new Vehicle(2, "TS10CD5678", "Van", 12);

        System.out.println("================================");
        System.out.println("      SMART TRANSPORT SYSTEM");
        System.out.println("================================");

        System.out.println("\nAvailable Vehicles:");

        vehicle1.displayVehicle();
        vehicle2.displayVehicle();

        System.out.print("\nEnter Passenger ID: ");
        int passengerId = sc.nextInt();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        if (distance <= 0) {
            System.out.println("Invalid distance!");
            sc.close();
            return;
        }

        if (vehicle1.isAvailable()) {

            Booking booking =
                new Booking(101, passengerId, vehicle1, distance);

            System.out.println("\nBooking Successful!");

            booking.displayBooking();

        } else {
            System.out.println("Vehicle is not available.");
        }

        sc.close();
    }
}