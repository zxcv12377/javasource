package api.util;

import java.util.*;

public class SetEx2 {
    public static void main(String[] args) {
        // 로또 번호 1 ~ 45 n = 6
        List<Integer> lotto1 = new ArrayList<>();
        Set<Integer> lotto2 = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            int rand = (int) (Math.random() * 45) + 1;
            lotto1.add(rand);
        }

        while (lotto2.size() < 6) {
            int rand = (int) (Math.random() * 45) + 1;
            lotto2.add(rand);
        }

        System.out.println(lotto1);
        System.out.println(lotto2);

        // Set => List 변경
        List<Integer> list = new ArrayList<>(lotto2);
        // list.sort(Comparator.reverseOrder());// 내림차순
        list.sort(Comparator.naturalOrder());// 오름차순

        System.out.println(list);

    }
}
