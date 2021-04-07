package AlgorithmBasic.Sorting;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] array = {3, 4, 7};
        System.out.print(Math.abs(Integer.MIN_VALUE));
    }
}
class Solution {
    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private Random random = new Random();
    private void quickSort(int[] array, int left, int right) {
        if (left <= right) {
            return;
        }
        // nextInt(x) --> [0, x - 1]
        // [0, right - left]
        // [left, right]
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(array, pivotIndex, right);
        int i = left, j = right - 1;
        while (i <= j) {
            if (array[i] < array[right]) {
                i++;
            } else {
                swap(array, i, j);
                j--;
            }
        }
        swap(array, i ,right);
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // time O(n)
    // space O(1)
    public void rainbowSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int i = 0, j = 0, k = array.length - 1;
        while (j <= k) { // j> k stop
            if (array[j] == 1) {
                swap(array, i , j);
                i++;
                j++;
            } else if (array[j] == 2) {
                j++;
            } else {
                swap(array, j, k);
                k--;
            }

        }
    }
    private void swap(Student[] array, int i , int j) {
        Student temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }
    // time O(n)
    // space O(1)
    public void rainbowSort(Student[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int i = 0, j = 0, k = array.length - 1;

        while (j <= k) {
            if (array[j].gpa == 1) {
                swap(array,i ,j);
                i++;
                j++;
            } else if (array[j].gpa == 2) {
                j++;
            } else {
                swap(array, j , k);
                k--;
            }
        }
    }
}
class Student {
    public String name;
    public int gpa;
}