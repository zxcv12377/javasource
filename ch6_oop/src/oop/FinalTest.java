package oop;

public class FinalTest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // this.MAX_SIZE = 20; (멤버변수)

        // final int LV = MAX_SIZE;(지역변수)
        // LV = 10;
    }
}

class Test extends FinalTest {
    // getMaxSize(); (메서드)
}
// public final class FinalTest { }(클래스)
// class Test extends FinalTest{ }
