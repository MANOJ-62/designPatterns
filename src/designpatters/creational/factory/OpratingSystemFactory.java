package designpatters.creational.factory;

public class OpratingSystemFactory {

    public OpratingSystem getInstance(String Os){
        if (Os.equals("Windows")){
            return new Windows();
        } else if (Os.equals("Linux")) {
            return new Linux();
        } else
            throw new IllegalArgumentException("OS not supported");
    }
}
