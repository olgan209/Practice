package first_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue4 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of tasks");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Task " + (i + 1) + ":");
            String task = sc.nextLine();
            q.add(task);
        }

        while (!q.isEmpty()) {
            String task = q.poll();
            System.out.println("Tasks complited" + task);
        }
    }
}