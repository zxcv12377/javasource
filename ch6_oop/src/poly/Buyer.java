package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;
    int i = 0;
    // 구입한 제품을 담을 수 있는 배열
    Product[] products = new Product[10];

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액 부족으로 물건 구매 불가");
            return;
        }
        this.money -= product.price;
        this.bonusPoint += product.bonusPoint;
        products[i++] = product;

        System.out.println("\"" + product + "\"을/를 구매하셨습니다.");

    }

    void summary() {
        int sum = 0;
        int bonusSum = 0;
        String itemList = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null)
                break;
            sum += products[i].price;
            bonusSum += products[i].bonusPoint;
            itemList += products[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 물품의 총 보너스금액은 " + bonusSum + "입니다.");
        System.out.println("구입하신 제품은 \"" + itemList + "\"입니다.");
    }

    // void buy(Product p) {
    // if (money < p.price) {
    // System.out.println("잔액 부족으로 물건 구매 불가");
    // return;
    // }
    // this.money -= p.price;
    // this.bonusPoint += p.bonusPoint;
    // System.out.println(p + "을/를 구매하셨습니다.\n남은 잔액은 " + money + ", 보너스 포인트는 " +
    // bonusPoint);
    // }

    // void buy(Product[] p) {
    // for (Product product : p) {
    // if (money < product.price) {
    // System.out.println("잔액 부족으로 물건 구매 불가");
    // return;
    // }
    // this.money -= product.price;
    // this.bonusPoint += product.bonusPoint;
    // System.out.println(product + "을/를 구매하셨습니다.\n남은 잔액은 " + money + ", 보너스 포인트는 "
    // + bonusPoint);
    // }

    // }
}
