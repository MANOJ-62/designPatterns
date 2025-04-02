package designpatters.creational.builder.InnerclassExample;

public class Car {

    private String maker;
    private String model;
    private long price;
    private String type;
    private String fuel;
    private String year;
    private boolean isAvailable;

    public Car(CarBuilder carBuilder) {
        this.maker = carBuilder.maker;
        this.model = carBuilder.model;
        this.price = carBuilder.price;
        this.type = carBuilder.type;
        this.fuel = carBuilder.fuel;
        this.year = carBuilder.year;
        this.isAvailable = carBuilder.isAvailable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year='" + year + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static class CarBuilder {
        String year;
        boolean isAvailable;
        String maker;
        String model;
        long price;
        String type;
        String fuel;

        public CarBuilder isAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public CarBuilder year(String year) {
            this.year = year;
            return this;
        }

        public CarBuilder maker(String maker) {
            this.maker = maker;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder type(String type) {
            this.type = type;
            return this;
        }

        public CarBuilder price(long price) {
            this.price = price;
            return this;
        }

        public CarBuilder fuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
