package search;

public class InterpolationSearchStudy {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        int target = interpolationSearch(array, 512);

        if (target != -1) System.out.println("Element found at: " + target );
        else System.out.println("Element not found");
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);
            if (array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;
        }

        return -1;
    }
//    если значения в массиве распределены равномерно, то можно примерно угадать,
//    где находится искомое значение, вместо того чтобы каждый раз делить массив
//    пополам, как в бинарном поиске. Мы рассчитываем, ближе ли искомое значение
//    к началу или к концу текущего диапазона, и на основе этого "угадываем" позицию.
}
