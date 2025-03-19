package lambda;

public class LambdaEx {
    public static void main(String[] args) {
        // Lambda2 를 사용
        // 1) 구현클래스 작성 : class LambdaImpl implements Lambda2{}
        // 2) 익명구현클래스
        // Lambda2 obj = new Lambda2() {
        // @Override
        // public void method() {

        // }
        // };
        // 3) 람다식으로 사용
        Lambda2 obj = () -> System.out.println("함수적 인터페이스 사용");
        obj.method();

        obj = () -> {
            int i = 100;
            System.out.println(i * i);
        };
        obj.method();

        Lambda3 obj2 = (a, b) -> a > b ? a : b;
        System.out.println("max : " + obj2.max(5, 3));
    }
}
