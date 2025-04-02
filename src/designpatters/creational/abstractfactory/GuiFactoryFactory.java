package designpatters.creational.abstractfactory;

public class GuiFactoryFactory {
    public static GUIFactory getFactory(String os){
        if ("windows".equalsIgnoreCase(os)){
            return new WindowsGui();
        } else if ("mac".equalsIgnoreCase(os)) {
            return new MacGui();
        }
        throw new IllegalArgumentException("Unknown OS: " + os);
    }
}
