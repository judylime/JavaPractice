package AlgorithmBasic.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = { 5, 3, 4, 7, 8, 2 , 1, 9};
        MergeSort solution = new MergeSort();
        System.out.println(Arrays.toString(solution.mergeSort(a)));
    }
    public int[] mergeSort(int[] array) {
        //corner case
        if (array == null || array.length <= 1) {
            return array;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] array, int left, int right) {
        // base case
        if (left == right) {
            return new int[] {array[left]};
        }
        //sub
        int mid = left + (right - left) / 2;
        int[] leftR = mergeSort(array, left, mid);
        int[] rightR = mergeSort(array, mid + 1, right);
        // recursion rule
        return merge(leftR, rightR);
    }
    /*
            L{3} left = 0 right = 2 mid = 1
            /  \
          L{2} L{1}
          /  \
        L{1} L{1}

        leftResult = [... ]
                            i
        rightResult = [... ]
                            j
        result = [... ]
                  k
     */
    private int[] merge(int[] leftR, int[] rightR) {
        int[] res = new int[leftR.length + rightR.length];
        int i = 0, j = 0, k = 0;
        while (i < leftR.length && j < rightR.length) {
            if (leftR[i] < rightR[j]) {
                res[k++] =  leftR[i++];
            } else {
                res[k++] = rightR[j++];
            }
        }
        /*
        how many cases:
        1) left has remaining
        2) right has remaining
        it is IMPOSSIBLE to have both empty
        [123] [456]
            \ /
          [123 ... ] the tail maybe long
         */
        while (i < leftR.length) {
            res[k++] = leftR[i++];
        }
        while (j < rightR.length) {
            res[k++] = rightR[j++];
        }
        return res;
    }
}
