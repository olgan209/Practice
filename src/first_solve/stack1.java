package first_solve;

import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println(stack.peek());
    }
}
//Создайте стек (Stack) целых чисел. Добавьте в него три
// числа и выведите на экран верхний элемент стека (без его удаления).