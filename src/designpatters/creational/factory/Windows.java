package designpatters.creational.factory;

public class Windows implements OpratingSystem{
    @Override
    public void print() {
        System.out.println("Loading windows");
    }
}
