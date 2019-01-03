
public class CocktailSort {

    public static void cocktailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            bubble(array, start, end);
            end--;
            if (start < end) {
                bubble(array, end, start);
                start++;
            } else {
                break;
            }
        }
    }

    private static int[] bubble(int[] array, int start, int end) {
        if (start < end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
        } else if (start > end) {
            for (int i = start; i > end; i--) {
                if (array[i] < array[i - 1]) {
                    int x = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = x;
                }
            }
        }
        return array;
    }
}


