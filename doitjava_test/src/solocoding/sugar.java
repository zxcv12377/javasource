package solocoding;

import java.util.Scanner;

// 백준 2839 설탕 배달
// 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
// 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
// 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

// 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
// 예를 들어, 18킬로그램 설탕을 배달해야 할 때,
// 3킬로그램 봉지 6개를 가져가도 되지만,
// 5킬로그램 3개와 3킬로그램 1개를 배달하면,
// 더 적은 개수의 봉지를 배달할 수 있다.

// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
// 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

public class sugar {
    static int min = 0;
    static int temp = 0;

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(plasticBag(n, 0, 0));
        sc.close();

    }

    public static int plasticBag(int n, int x, int y) {
        // 3x+5y = n
        // 3x = n-5y
        // x + y = n;
        if (y < 0)
            return -1;
        if ((3 * x) + (5 * y) < n) {
            return plasticBag(n, x, y + 1);
        } else if ((3 * x) + (5 * y) > n) {
            return plasticBag(n, x + 1, y - 1);
        } else {
            min = x + y;
        }

        return min;
    }
}
