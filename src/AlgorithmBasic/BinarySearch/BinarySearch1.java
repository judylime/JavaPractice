package AlgorithmBasic.BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] test = {9, 10, 12, 3, 3, 4, 5};
        int target = 10;
        int result = binarySearch(test, target);
        System.out.println(result);
    }
    // {1, 1, 2, 3, 3, 4, 5};

    public static int binarySearch(int[] array, int target) {
        // corner case
        if (array == null || array.length == 0) return -1;
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
