package AlgorithmBasic.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        // check null before any other things
        // check other conditions - empty array... etc
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        return array;
    }

    private void swap(int[] array, int i , int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        SelectionSort solution = new SelectionSort();

        //test case to cover all the possible situations
        int[] array = null;
        array = solution.selectionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[0];
        array = solution.selectionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {1, 2, 3};
        array = solution.selectionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {3, 2, 1};
        array = solution.selectionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {2, 4, 1, 5, 3};
        array = solution.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
//    public int[] selectionSort(int[] array) {
//        // corner case
//        if (array == null || array.length <= 1) {
//            return array;
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j]  < array[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            swap(array, i, minIndex);
//        }
//        return array;
//    }
//
//    private void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//    public static void main(String[] args) {
//        int[] a = { 5, 3, 4, 7, 8, 2 , 1, 9};
//        SelectionSort solution = new SelectionSort();
//        System.out.println(Arrays.toString(solution.selectionSort(a)));
//    }
}

