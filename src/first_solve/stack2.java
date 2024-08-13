package first_solve;

import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        for (int i = n; i > 0; i--) {
            System.out.println(stack.pop());
        }
    }
}
// Напишите программу, которая добавляет элементы в стек
// и затем удаляет элементы из стека, выводя каждый удаленный элемент на экран.
//