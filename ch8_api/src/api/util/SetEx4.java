package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            int rand = (int) (Math.random() * 45) + 1;
            lotto2.add(rand);
        }
        // [13, 25, 13, 44, 6, 18]
        // [1, 2, 14, 19, 27, 40]
        System.out.println(lotto2);
    }
}
