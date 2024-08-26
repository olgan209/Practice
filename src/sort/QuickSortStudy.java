package sort;

public class QuickSortStudy {
    public static void main(String[] args) {

        // quick sort = moves smaller elements to left of a pivot.
        // recursively divide array in 2 partition;

        //run-time complexity = Best case O(n log n)
        //                      Average case O(n log n)
        //                      Worst case O(n^2) if already sorted

        //space complexity = O (log n) due to recursion
        int[] array = {8, 4, 2, 1, 6, 3, 7, 5, 9, 0};

        quickSort(array, 0, array.length - 1);

        for (int i : array){
            System.out.println(i + " ");
        }

    }
    public static void quickSort(int[] array, int start, int end){

        if (end <= start) return; // base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <=  end - 1 ; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
