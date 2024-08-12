package first_solve;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        int counter = 0;
        for (String s : list) {
            if(s.length() > 4){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
