package first_solve;

import java.util.LinkedList;
import java.util.Queue;

public class queue3 {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        q.add('A');
        q.add('B');
        q.add('C');

        System.out.println(q.peek());
        System.out.println(q);
    }
}
