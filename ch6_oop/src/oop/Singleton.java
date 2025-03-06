package oop;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    static Singleton getIstance() {
        return singleton;
    }
}
