package oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        // 클래스 메서드(or 변수)이기 때문에 객체 생성없이 클래스이름.으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // 인스턴스 메서드이기때문에 객체 생성 후 호출
        MiniCalc miniCalc = new MiniCalc();
        miniCalc.execute();
        miniCalc.a = 7;
    }
}
