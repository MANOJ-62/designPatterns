package designpatters.creational.builder;

public class VehicleBuilder {

    String maker;
    String model;
    long price;
    String type;
    String fuel;
    String year;
    boolean isAvailable;

    public VehicleBuilder setMaker(String maker) {
        this.maker = maker;
        return this;
    }

    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public VehicleBuilder trice(long price) {
        this.price = price;
        return this;
    }

    public VehicleBuilder type(String type) {
        this.type = type;
        return this;
    }

    public VehicleBuilder fuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    public VehicleBuilder year(String year) {
        this.year = year;
        return this;
    }

    public VehicleBuilder available(boolean available) {
        isAvailable = available;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(this);
    }
}
