package inter;

public interface PlayingCard {
    // 멤버 변수 X
    // boolean pause;

    // 상수 O (대문자로 선언)
    public static final int SPADE = 4;
    // public static final는 생략 가능
    int CLOVER = 1;

    // 일반 메서드 X
    // void pause(){}

    // 추상 메서드 O
    // public abstract는 생략 가능
    void pause();

    // static, default가 붙는다면 일반 메서드도 허용
    static void display() {
    }

    default void print() {
    }
}
