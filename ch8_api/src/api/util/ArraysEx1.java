package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {
        Integer[] arr = { 33, 24, 15, 76, 7 };
        System.out.println("정렬 전" + Arrays.toString(arr));

        // Arrays.sort(arr);

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("정렬 후" + Arrays.toString(arr));

        // 문자 정렬
        Character[] characters = { 'a', 'k', 'b', 't', 'o' };
        Arrays.sort(characters, Comparator.naturalOrder());
        System.out.println(Arrays.toString(characters));

    }
}
