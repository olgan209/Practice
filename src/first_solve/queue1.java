package first_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        q.poll();

        System.out.println(q);
    }
}