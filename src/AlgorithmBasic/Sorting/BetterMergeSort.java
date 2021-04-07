package AlgorithmBasic.Sorting;

import java.util.Arrays;

public class BetterMergeSort  {
    public static void main(String[] args) {
        BetterMergeSort  solution = new BetterMergeSort ();
        // test case
        int[] array = new int [] {2,4,1,5,3};
        array = solution.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public int[] mergeSort(int[] array) {
        // corner case
        if(array == null) {
            return array;
        }
        // allocate helper array to help merge step, so that we guarantee no more than O(n) space is used. SC:O(n)
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }
    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }
    private void merge(int[] array, int[] helper, int left, int mid, int right) {
        // copy the content to res array nad we will merge from the res array
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int leftIndex = left;
        int rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightIndex++];
            }
        }
        // if we still have some elements at left side ,we need to copy them
        while (leftIndex <= mid) {
            array[left++] = helper[leftIndex++];
        }
        // if there are some element at right side, we do not need to copy them, because they are already in theis position
    }
}
