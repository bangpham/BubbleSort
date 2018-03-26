public class BubbleSort () {
    /*  in-place
     *  stable
     * Have a worst case running time of:
     *  O(n^2)
     * And a best case running time of:
     *  O(n)
     * Any duplicate in the array should be in the same relative position after
     * sorting as they were before sorting. (stable).
     *
     * @throws IllegalArgumentException if the array or comparator is null
     * @param <T> data type to sort
     * @param arr the array that must be sorted after the method runs
     * @param comparator the Comparator used to compare the data in arr
     */
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        if (arr == null || comparator == null) {
            throw new IllegalArgumentException("array or comparator is null");
        }
        T temp = null;
        boolean duplicateExist = false;
        for (int i = arr.length - 1; i > 0 && !duplicateExist; i--) {
            duplicateExist = true;
            for (int j = 0; j < i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    duplicateExist = false;
                }
            }
        }
    }
}