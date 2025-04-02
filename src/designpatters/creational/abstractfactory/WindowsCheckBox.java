package designpatters.creational.abstractfactory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Windows check box");
    }
}
