package first_solve;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
