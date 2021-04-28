package AlgorithmBasic.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 8};
        int target = 8;
        int result = binarySearch(array, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] array, int target) {
        // validate input, make sufficient assumption
        if (array == null || array.length == 0) {
            return -1;
        }
        // binary search main logic
        // if target exists, it must in the range of [left, right]
        int left = 0; //initialization
        int right = array.length - 1;
        //target exists, in the range of [left,right] key point 1
        // we need to be able to jump out of the while loop. terminate condition
        // key point 2
        while (left <= right) { // terminate condition is no element left in [L, R] left < right WRONG
            // find mid point;
            int mid = left + (right - left) / 2; // = (left + right) / 2
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1; // next search range is [mid+1, right]
            } else {
                right = mid - 1; // left = mid WRONG
            }
        }
        // 1 element left -- can jump out
        // 2 elements left:
        // left right
        // mid
        // either next round: 0 element or 1 element
        return -1;
    }
}
