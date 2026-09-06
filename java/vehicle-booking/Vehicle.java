public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private String vehicleType;
    private double farePerKm;
    private boolean available;

    public Vehicle(int vehicleId, String vehicleNumber,
                   String vehicleType, double farePerKm) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.farePerKm = farePerKm;
        this.available = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getFarePerKm() {
        return farePerKm;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayVehicle() {
        System.out.println(
            vehicleId + " | " +
            vehicleNumber + " | " +
            vehicleType + " | ₹" +
            farePerKm + "/km | Available: " +
            available
        );
    }
}