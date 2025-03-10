package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();
        car.drive();
        car.stop();

        // FireEngine fe = (FireEngine) car;
        // fe.water();
        ((FireEngine) car).water();

        // instance of : 참조변수가 참조하고 있는 실제 인스턴스의 타입 알아보기
        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 임");
        }
        if (car instanceof Car) {
            System.out.println("Car의 instance 임");
        }
        System.out.println();

        Car car2 = new Car();

        if (car2 instanceof FireEngine) {
            // (FireEngine)car2; 안됨
            System.out.println("FireEngine의 instance 임");
        }
        if (car2 instanceof Car) {
            System.out.println("Car의 instance 임");
        }
    }
}
