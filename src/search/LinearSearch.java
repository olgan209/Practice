package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 4, 9, 1};
        int index = linearSearch(array, 10);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
