package AlgorithmBasic.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[] array = {3, 4, 7};

        System.out.print(Arrays.toString(array));
    }
    public static int[] search(int[][] matrix, int target) {
        int[] res = {-1, -1};
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            //mid index
            int mid = left + (right - left) / 2;
            if (target == matrix[mid/n][mid%n]) {
                res[0] = mid / n;
                res[1] = mid % n;
                return res;
            } else if (target < matrix[mid/n][mid%n]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
