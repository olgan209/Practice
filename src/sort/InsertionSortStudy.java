package sort;

public class InsertionSortStudy {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 32, 6, 4, 9, 0};
        insertionSort(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
