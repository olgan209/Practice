package first_solve;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;

        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }

        int max = arr[0];
        i = 0;
        while (i < n-1) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }

        System.out.println(max);
    }
}
