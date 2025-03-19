package thread;

public class SmallLetters2 extends Thread {

    public SmallLetters2() {
        setName("SmallLetters2");
    }

    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }
    }

}
