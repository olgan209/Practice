package first_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue2 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

        if (q.isEmpty()){
            System.out.println("Empty");
            q.offer("I");
            q.offer("Love");
            q.offer("you");
        }
        System.out.println(q);
        if (!q.isEmpty()) {
            System.out.println("Not empty");
        }
    }
}