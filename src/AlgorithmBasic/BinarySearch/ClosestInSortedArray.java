package AlgorithmBasic.BinarySearch;

public class ClosestInSortedArray {
    public static void main(String[] args) {

    }
    public static int closest(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        if (array.length == 1) return 0;

        int left = 0;
        int right = array.length - 1;
        //key point 1 -- target exists in the [left, right]
        //key point 2 -- jump out of the while loop normally
        while (left < right - 1){
            int mid = left + (right - left) /2;
            if(array[mid] == target) return mid;
            else if (array[mid] < target) left = mid; // [1, 17, 18], target = 6
            else right = mid; //array[mid] > target
        }
        //post processing -- 2 elements
        if (Math.abs(array[left] -target) <= Math.abs(array[right] - target)) return left;
        return right;
    }
}
