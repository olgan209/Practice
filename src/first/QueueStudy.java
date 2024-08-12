package first;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        //Queue = FIFO data structure. First in First Out (line of people).
        // A collection designed for holding elements prior to processing Linear data structure

        // add = enqueue, offer() tail
        //remove = dequeue, poll() head

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chen");
        queue.offer("Steve");
        queue.offer("Harold");

        //System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold")); //true
        System.out.println(queue);


    }
}
