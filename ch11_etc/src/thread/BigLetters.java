package thread;

public class BigLetters {
    public static void main(String[] args) {

        // Thread t1 = new Thread(new SmallLetters());

        // 익명구현객체
        // - 인터페이스, 추상클래스 : 구현객체를 무조건 생성한 후 사용
        // - 한번만 사용한다면 익명구현객체를 이용한다.
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.print(ch + "\t");
                }
            }
        });
        t3.start();

        Runnable r = () -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + "\t");
            }
        };
        Thread t4 = new Thread(r);
        t4.start();

        Thread t1 = new SmallLetters2();
        Thread t2 = new NumPrint();
        System.out.println("Thread t1's name : " + t1.getName());
        t1.start();
        System.out.println("Thread t2's name : " + t2.getName());
        t2.start();

        // main Thread's name
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread main's name : " + mainThread.getName());

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
