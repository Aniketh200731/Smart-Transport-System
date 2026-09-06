import java.util.Scanner;

public class Passenger {

    int passengerId;
    String name;
    int age;
    String phone;

    Passenger(int passengerId, String name, int age, String phone) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    void displayPassenger() {
        System.out.println("\n--- Passenger Details ---");
        System.out.println("Passenger ID : " + passengerId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Phone        : " + phone);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     PASSENGER MANAGEMENT");
        System.out.println("================================");

        System.out.print("Enter Passenger ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        Passenger passenger = new Passenger(id, name, age, phone);

        passenger.displayPassenger();

        sc.close();
    }
}