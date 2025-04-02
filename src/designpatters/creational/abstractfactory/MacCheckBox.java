package designpatters.creational.abstractfactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Mac check box");
    }
}
