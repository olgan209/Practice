package first_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queue5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(q.poll());
        }
        for (int i = 0; i < n; i++) {
            q.offer(s.pop());
        }

        System.out.println(s);
        System.out.println(q);
    }
}
//Создайте очередь целых чисел и напишите программу,
// которая изменяет порядок элементов в очереди на обратный.
// Не используйте дополнительную очередь или коллекции для хранения данных.