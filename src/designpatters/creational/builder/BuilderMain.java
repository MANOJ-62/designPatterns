package designpatters.creational.builder;

import designpatters.creational.builder.InnerclassExample.Car;

public class BuilderMain {
    public static void main(String[] args) {
        Vehicle car = new VehicleBuilder().available(true).setMaker("TATA").fuel("Disel").build();
        Vehicle bike = new VehicleBuilder().fuel("Petrol").build();

        Car newCar = new Car.CarBuilder().fuel("petrol").build();
        Car honda = new Car.CarBuilder().year("2025").price(150000).build();

        System.out.println(car);
        System.out.println(bike);

        System.out.println(newCar);
        System.out.println(honda);
    }
}
