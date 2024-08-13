package first_solve;

import java.util.Stack;

public class stack5 {
    public static void main(String[] args) {
        String expression = "([]){}";
        System.out.println("Is balanced: " + isBalanced(expression));
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') || (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

