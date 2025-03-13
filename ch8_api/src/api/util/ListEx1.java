package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 추가
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(8);
        System.out.println(list);
        list.add(2, 10);
        System.out.println(list);
        // 조회
        System.out.println("특정 위치 요소 조회 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(4));
        System.out.println("특정 요소 제거 " + list.remove(Integer.valueOf(7)));
        System.out.println(list);
    }
}
