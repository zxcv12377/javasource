package solocoding;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    static int result = 0;
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> timeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        for (String string : arr) {
            list.add(Integer.parseInt(string));
        }

        System.out.println(atmTime(n));
        sc.close();
    }

    public static int atmTime(int a) {
        timeList.add(list.get(0));
        timeList.add(list.get(1) + list.get(0));
        for (int i = 2; i < list.size() - 1; i++) {
            timeList.add(list.get(i) + list.get(i + 1));
        }
        for (Integer integer : timeList) {
            System.out.println("result : " + result);
            result += integer;
        }
        return result;
    }

}
