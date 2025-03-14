package api.util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {

    public static void main(String[] args) {
        // 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 123 130 139 160 169 173 175

        // int max = 0;
        // int year = 2015;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> size = new ArrayList<>();
        // ArrayList<Integer> sizeOfYear = new ArrayList<>();
        String input = (sc.nextLine());
        StringTokenizer strToken = new StringTokenizer(input);
        while (strToken.hasMoreTokens()) {
            // size.add(Integer.parseInt(strToken.toString()));
            size.add(Integer.parseInt(strToken.nextToken()));
        }
        // 강사님이 만든것
        int diff = 0;
        int pos = 0;
        for (int i = 0; i < size.size() - 1; i++) {
            int sub = size.get(i + 1) - size.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }

        System.out.println(pos + 2015);

        // 처음꺼 개선
        // for (int i = 0; i < size.size() - 1; i++) {
        // max = Math.max(max, size.get(i + 1) - size.get(i));
        // sizeOfYear.add(size.get(i + 1) - size.get(i));
        // }
        // year += sizeOfYear.indexOf(max);

        // 처음 만든것

        // for (int i = 0; i < size.size() - 1; i++) {
        // sizeOfYear.add(size.get(i + 1) - size.get(i));
        // }

        // for (Integer integer : sizeOfYear) {
        // max = Math.max(max, integer);
        // }

        // year += sizeOfYear.indexOf(max);

        // System.out.println(year);
        // System.out.println(max);
        sc.close();
    }
}
