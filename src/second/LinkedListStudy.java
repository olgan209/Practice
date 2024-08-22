package second;

import java.util.LinkedList;

public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        list.pop();

        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        list.offer("E");

        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        list.poll();

        list.add(4, "E");
        list.remove("F");
        System.out.println(list.indexOf("A"));

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());


        System.out.println(list);
    }
}
