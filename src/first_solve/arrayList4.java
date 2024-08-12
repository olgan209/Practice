package first_solve;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int m = sc.nextInt();
        if (list.contains(m)) {
            System.out.println("Ye... its here. your array: " + list);
        } else {
            list.add(m);
            System.out.println(list);
        }

    }
}
