package sort;

public class MergeSort {
    public static void main(String[] args) {
//        merge sort = recursively divide array in 2 , sort, re-combine
//        run time complexity = O(n log n)
//        space complexity = O(n)

        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };

        mergeSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr){
        int len = arr.length;
        if(len <= 1) return;

        int mid = len / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        for(int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for(int i = mid; i < len; i++) {
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr){

        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int i = 0, l = 0, r = 0;

        // Merging left and right arrays into the original array
        while(l < leftSize && r < rightSize) {
            if(leftArr[l] <= rightArr[r]) {
                arr[i] = leftArr[l];
                l++;
            } else {
                arr[i] = rightArr[r];
                r++;
            }
            i++;
        }

        // Copy remaining elements of leftArr[] if any
        while(l < leftSize) {
            arr[i] = leftArr[l];
            l++;
            i++;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }

    }
}
