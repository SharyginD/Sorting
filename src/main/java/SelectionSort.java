
public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int indexOfSmallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    indexOfSmallest = j;
                }
            }
            int s = array[i];
            array[i] = array[indexOfSmallest];
            array[indexOfSmallest] = s;
        }
    }
}
