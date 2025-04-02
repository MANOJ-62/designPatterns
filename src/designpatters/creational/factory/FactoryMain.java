package designpatters.creational.factory;

public class FactoryMain {

    public static void main(String[] args) {
        OpratingSystemFactory osFactory = new OpratingSystemFactory();
        OpratingSystem windows = osFactory.getInstance("Windows");
        OpratingSystem linux = osFactory.getInstance("Linux");

        windows.print();
        linux.print();
    }

}
