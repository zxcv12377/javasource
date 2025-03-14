package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        // 검색
        Integer[] arr = { 33, 24, 15, 76, 7 };
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 15));

        // 배열 비교
        Integer[] arr1 = { 33, 24, 15, 76, 7 };
        Integer[] arr2 = { 33, 24, 15, 76, 8 };
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
