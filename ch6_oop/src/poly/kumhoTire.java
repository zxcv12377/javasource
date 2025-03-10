package poly;

public class kumhoTire extends Tire {

    public kumhoTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) {
            System.out.println(location + "kumho Tire 수명 : " + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "kumho Tire 펑크 ***");
            return false;
        }
    }

}
