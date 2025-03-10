package poly;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();

        // Computer computer[] = new Computer[3];
        // Tv tv[] = new Tv[3];
        // Audio audio[] = new Audio[3];

        // System.out.println("남은 돈은 " + buyer.money + "만원입니다.");
        // System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + "입니다.");

        // for (int i = 0; i < audio.length; i++) {
        // computer[i] = new Computer();
        // tv[i] = new Tv();
        // audio[i] = new Audio();
        // }
        // buyer.buy(computer);
        // buyer.buy(tv);
        // buyer.buy(audio);
    }
}
