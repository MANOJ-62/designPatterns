package designpatters.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        NonSynchronizedSingleton ns1 = NonSynchronizedSingleton.getInstance();
        NonSynchronizedSingleton ns2 = NonSynchronizedSingleton.getInstance();

        System.out.println(" ");
        System.out.println("Non Synorized Example");
        System.out.println(ns1.hashCode());
        System.out.println(ns2.hashCode());

        // Enum Singleton Example
        EnumSingleton e1 = EnumSingleton.instance;
        EnumSingleton e2 = EnumSingleton.instance;

        System.out.println(" ");
        System.out.println("Enum Example");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        // Serilizable Safe Singletone
        SerializeSafeSingleton ss = SerializeSafeSingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj1.obj"));
        objectOutputStream.writeObject(ss);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj1.obj"));
        SerializeSafeSingleton deserialized = (SerializeSafeSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(" ");
        System.out.println("Serializable safe Example");
        System.out.println(ss.hashCode());
        System.out.println(deserialized.hashCode());

        //Breaking Singleton using java reflections
        Constructor[] constructors = SerializeSafeSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        SerializeSafeSingleton serializeSafeSingleton = (SerializeSafeSingleton) constructor.newInstance();
        SerializeSafeSingleton serializeSafeSingleton1 = SerializeSafeSingleton.getInstance();

        System.out.println(" ");
        System.out.println("Breaking Singlton by using Java Reflections");
        System.out.println(serializeSafeSingleton.hashCode());
        System.out.println(serializeSafeSingleton1.hashCode());
    }
}
