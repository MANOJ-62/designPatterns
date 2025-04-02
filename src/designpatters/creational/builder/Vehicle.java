package designpatters.creational.builder;

public class Vehicle {

    private String maker;
    private String model;
    private long price;
    private String type;
    private String fuel;
    private String year;
    private boolean isAvailable;

    public Vehicle(VehicleBuilder vehicleBuilder) {
        this.maker = vehicleBuilder.maker;
        this.model = vehicleBuilder.model;
        this.price = vehicleBuilder.price;
        this.type = vehicleBuilder.type;
        this.fuel = vehicleBuilder.fuel;
        this.year = vehicleBuilder.year;
        this.isAvailable = vehicleBuilder.isAvailable;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year='" + year + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
