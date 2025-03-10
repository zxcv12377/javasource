package poly;

public class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive, Brrr~~~");
    }

    void stop() {
        System.out.println("Stoooooooooooop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water~~~");
    }
}
