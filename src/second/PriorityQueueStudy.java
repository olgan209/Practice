package second;

import java.util.Collections;
import java.util.Queue;

public class PriorityQueueStudy {
    public static void main(String[] args) {
        Queue<String> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("C");
        queue.offer("F");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
