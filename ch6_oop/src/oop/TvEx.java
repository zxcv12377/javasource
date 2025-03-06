package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.size = 50;
        tv1.color = "black";

        Tv2 tv2 = new Tv2(60, "white");
        // tv 켜기
        tv2.power();
        // 채널 변경
        tv2.changeChannel(7);
        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeChannel(11);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태 = " + obj1.toString());
        obj1.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());
    }
}
