package poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire frontLeft = new HankookTire(1, "앞왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞오른쪽");
        HankookTire bakcLeft = new HankookTire(1, "뒤왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤오른쪽");

        Car3 car3 = new Car3(frontLeft, frontRight, bakcLeft, backRight);

        Car3 car4 = new Car3(new HankookTire(1, "앞왼쪽"), frontRight,
                bakcLeft, backRight);

        System.out.println(car3.frontleft);
        System.out.println(car3.frontleft.accumulateRotation);
    }
}
