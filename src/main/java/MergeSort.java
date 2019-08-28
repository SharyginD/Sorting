public class MergeSort {

    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;

        int[] left = new int[midpoint];
        int[] right = new int[array.length - midpoint];

        for (int i = 0; i < midpoint; i++) {

            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {

            right[j] = array[j + midpoint];
        }

        int[] result;

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {

            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
