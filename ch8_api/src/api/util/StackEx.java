package api.util;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        // List<String> list = new Stack<>();

        Stack<String> stack = new Stack<>();
        stack.push("사과");
        stack.push("포도");
        stack.push("감자");
        stack.push("키위");
        stack.push("망고");
        System.out.println(stack.toString());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

}
