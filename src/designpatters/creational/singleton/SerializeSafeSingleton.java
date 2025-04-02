package designpatters.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializeSafeSingleton implements Serializable {

    private static SerializeSafeSingleton instance;

    private SerializeSafeSingleton(){

    }

    public static SerializeSafeSingleton getInstance(){
        if (instance == null){
            instance = new SerializeSafeSingleton();
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

}
