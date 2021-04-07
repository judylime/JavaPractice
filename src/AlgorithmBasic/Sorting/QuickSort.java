package AlgorithmBasic.Sorting;

import java.util.Random;

public class QuickSort {
    private Random random = new Random();
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private void quickSort(int[] array, int left, int right) {
        if (left <= right) {
            return;
        }
        // get pivot index randomly in [left, right]
        // k = random.nextInt(x) -> a random k in [0,x) = [0, x - 1]
        // R[left, right] - > left + R[0, right - left]
        // x in [left, right]
        // x = left + y
        // y = x - left
        // y in [0, right - left]
        // y in [0, right - left + 1)
        int pivotIndex = left + random.nextInt(right - left + 1);

        swap(array, pivotIndex, right);

        int i = left;
        int j = right - 1;
        while (i <= j) {
            if (array[i] < array[right]) {
                i++;
            } else {
                swap(array, i , j);
                j--;
            }
        }
        swap(array, right, i);

        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 10};
        QuickSort test = new QuickSort();
        test.quickSort(a);

        for (int i : a) {
            System.out.print(i + ",");
        }
    }
}
