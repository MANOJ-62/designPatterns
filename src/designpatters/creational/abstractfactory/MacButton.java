package designpatters.creational.abstractfactory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
