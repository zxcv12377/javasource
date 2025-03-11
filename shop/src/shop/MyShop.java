package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    private User[] users = new User[5];
    private Product[] products = new Product[10];
    private Product[] cart = new Product[10];
    private int cUserNum;
    private int num = 0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        users[0] = new User("옥동국", PayType.CARD);
        users[1] = new User("장효성", PayType.CASH);
    }

    @Override
    public void genProduct() {
        products[0] = new TV("삼성 TV", 2500000, "4K");
        products[1] = new TV("LG TV", 3000000, "4K");
        products[2] = new CellPhone("갤럭시 S25", 1500000, "KT");
        products[3] = new CellPhone("갤럭시 A20", 1000000, "U+");
        products[4] = new CellPhone("아이폰16+", 2300000, "SKT");
    }

    @Override
    public void start() {
        System.out.println(this.title + " : 메인화면 - 계정선택");
        System.out.println("============================");
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                break;
            System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());

        }
        System.out.println("[X] 종료");
        System.out.println("============================");
        System.out.printf("선택 : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("x")) {
            System.out.println("프로그램 종료");
            System.exit(0);
        } else if (input.equals("0") || input.equals("1")) {
            cUserNum = Integer.parseInt(input);

            productList();
        } else {
            System.out.println("입력을 확인하세요");
            start();
        }
    }

    public void productList() {

        System.out.println(this.title + " : 상품목록 - 상품선택");
        System.out.println("============================");
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                break;
            }
            System.out.printf("[%d]", i);
            products[i].printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("============================");
        System.out.print("선택 : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("h")) {
            System.out.println("메인 화면으로 넘어갑니다.");
            start();
        } else if (input.equalsIgnoreCase("c")) {
            if (cart[0] == null) {
                System.out.println("카트에 담긴 것이 없습니다.");
                productList();
            }
            checkOut();
        } else if (Integer.parseInt(input) < products.length && Integer.parseInt(input) >= 0
                && products[Integer.parseInt(input)] != null) {
            // else if (input.equals("0") || input.equals("1")
            // || input.equals("2") || input.equals("3")
            // || input.equals("4")) {
            cart[num++] = products[Integer.parseInt(input)];
            if (num > 9) {
                System.out.println("카트가 가득 찼습니다. 체크아웃 화면으로 넘어갑니다.");
                checkOut();
            }
            System.out.printf("[%s] 번의 상품이 담겼습니다.\n", input);
            productList();
        } else {
            System.out.println("다시 입력하세요");
            productList();
        }

    }

    public void checkOut() {
        int sum = 0;
        System.out.println(this.title + " :  " + users[cUserNum].getName() + " - 체크아웃");
        System.out.println("============================");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            System.out.printf("[%d]", i);
            System.out.printf(" %s (%d)\n", cart[i].getpName(), cart[i].getPrice());
            // cart[i].printDetail();
            sum += cart[i].getPrice();
        }
        System.out.println("결제 방법 : " + users[cUserNum].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("============================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("q")) {
            System.out.println("시스템 종료");
            sc.close();
            System.exit(0);
        } else if (input.equalsIgnoreCase("p")) {
            System.out.println("이전으로 돌아갑니다");
            productList();
        } else {
            System.out.println("잘못된 입력입니다.");
            checkOut();
        }
    }
}
