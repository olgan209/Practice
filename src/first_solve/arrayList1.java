package first_solve;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.add(0, 0);
        list.add(n+1, 0);

        System.out.println(list);

    }
}