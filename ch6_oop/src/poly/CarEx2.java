package poly;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();

        for (int i = 0; i < 5; i++) {
            int problemLocation = car2.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 교체");
                    car2.frontleft = new HankookTire(15, "앞왼쪽");
                    break;

                case 2:
                    System.out.println("앞 오른쪽 교체");
                    car2.frontright = new kumhoTire(13, "앞오른쪽");
                    break;

                case 3:
                    System.out.println("뒤 왼쪽 교체");
                    car2.backleft = new HankookTire(5, "뒤왼쪽");
                    break;

                case 4:
                    System.out.println("뒤 오른쪽 교체");
                    car2.backright = new HankookTire(13, "뒤오른쪽");
                    break;

                default:
                    break;
            }
        }
    }
}
