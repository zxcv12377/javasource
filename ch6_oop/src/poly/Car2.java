package poly;

public class Car2 {
    Tire frontleft = new HankookTire(6, "앞왼쪽");
    Tire frontright = new HankookTire(2, "앞오른쪽");
    Tire backleft = new kumhoTire(3, "뒤왼쪽");
    Tire backright = new kumhoTire(4, "뒤오른쪽");

    int run() {
        System.out.println("[자동차가 주행중입니다.]");
        if (!frontleft.roll()) {
            stop();
            return 1;
        } else if (!frontright.roll()) {
            stop();
            return 2;
        } else if (!backleft.roll()) {
            stop();
            return 3;
        } else if (!backright.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
