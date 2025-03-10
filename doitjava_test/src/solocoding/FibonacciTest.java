package solocoding;

public class FibonacciTest {
    public static Long f(int a) {
        Long[] arr = new Long[a + 1];
        arr[0] = 0L;
        arr[1] = 1L;
        for (int i = 2; i <= a; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[a];
    }

    public static void main(String[] args) {
        int a = 80;
        System.out.println(f(a));
    }
}
