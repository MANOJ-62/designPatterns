package designpatters.creational.abstractfactory;

import static designpatters.creational.abstractfactory.GuiFactoryFactory.getFactory;

public class AbstractFactoryMain {
    // Get the factory based on OS type

    public static void main(String[] args) {
        GuiFactoryFactory guiFactoryFactory = new GuiFactoryFactory();

        GUIFactory factory = GuiFactoryFactory.getFactory("Windows");

        // Create and use Windows components
        Button button = factory.createButton();
        CheckBox checkbox = factory.createCheckBox();

        button.render();
        checkbox.check();

        // Switch to Mac factory
        factory = getFactory("Mac");

        // Create and use Mac components
        Button macButton = factory.createButton();
        CheckBox macCheckbox = factory.createCheckBox();

        macButton.render();
        macCheckbox.check();
    }
}
