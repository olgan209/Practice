package first_solve;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = list.size()-1; i > 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }
}
//при удалении элемента из ArrayList внутри цикла for,
// индексы элементов смещаются, что приводит к пропуску некоторых элементов.