
public class InsertionSort {

    public static void insertionSort(int[] array) {
        int element;
        int indexToInsert;
        for (int i = 1; i < array.length; i++) {
            element = array[i];
            indexToInsert = i;

            while (indexToInsert > 0 && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }
}
