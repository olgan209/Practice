package first_solve;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int b = sc.nextInt();
        int c = sc.nextInt();

        list.addFirst(b);
        list.addLast(c);

        System.out.println(list);
    }
}
