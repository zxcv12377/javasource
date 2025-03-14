package api.util;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("사과");
        queue.offer("딸기");
        queue.offer("포도");
        queue.offer("망고");
        queue.offer("수박");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
