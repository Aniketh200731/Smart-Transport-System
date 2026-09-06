public class Booking {

    private int bookingId;
    private int passengerId;
    private Vehicle vehicle;
    private double distance;
    private double fare;

    public Booking(int bookingId, int passengerId,
                   Vehicle vehicle, double distance) {

        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.vehicle = vehicle;
        this.distance = distance;
        this.fare = vehicle.getFarePerKm() * distance;

        vehicle.setAvailable(false);
    }

    public void displayBooking() {

        System.out.println("\n----- BOOKING DETAILS -----");
        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Passenger ID : " + passengerId);
        System.out.println("Vehicle      : " + vehicle.getVehicleNumber());
        System.out.println("Vehicle Type : " + vehicle.getVehicleType());
        System.out.println("Distance     : " + distance + " km");
        System.out.println("Total Fare   : ₹" + fare);
    }

    public void cancelBooking() {

        vehicle.setAvailable(true);

        System.out.println("Booking cancelled successfully.");
    }
}