package first_solve;

import java.util.Scanner;
import java.util.Stack;

public class stack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        toString(stack);
    }

    public static String toString(Stack<Character> stack) {
        StringBuilder reversedString = new StringBuilder("");
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        System.out.println(reversedString);
        return reversedString.toString();
    }
}
//Создайте стек символов. Напишите программу, которая принимает строку,
// помещает каждый символ строки в стек, а затем извлекает их в обратном
// порядке, чтобы получить перевернутую строку.