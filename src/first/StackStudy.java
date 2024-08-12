package first;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Dune");
        stack.push("Borderlands");
        stack.push("Cru");

        //stack.pop(); // delete the last one
        //String myFavGame = stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.search("Dune")); // 3 from the top
        System.out.println(stack);
        System.out.println(stack.empty());

        //you can run out of memory in stack if add to many elements
    }
}
