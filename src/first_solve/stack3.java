package first_solve;

import java.util.Scanner;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.next());
        }

        System.out.println(stack.isEmpty());

        for (int i = n; i > 0; i--) {
            stack.pop();
            System.out.println(stack.isEmpty());
        }
    }
}
//Создайте стек строк. Напишите программу, которая проверяет,
// пустой ли стек, после добавления и удаления элементов.