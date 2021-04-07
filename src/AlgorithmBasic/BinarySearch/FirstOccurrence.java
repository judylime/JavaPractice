package AlgorithmBasic.BinarySearch;

import java.util.Arrays;

public class FirstOccurrence {
    public int firstOccur(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        //  key point 1 --> // key point 2
        while (left < right - 1) {
            //0 element:
            //1 element: can not jump out. can't use left <= right
            //2 elements:left  right  [2,3] , target = 3
            //          mid -> what if left = mid
            //3 elements: left mid right
            int mid = left + (right - left) / 2;
            if (array[mid] >= target) right = mid;
            else left = mid;
        }
        //posting processing --> 1 element + 2 elements
        if (array[left] == target) return left;
        if (array[right] ==target) return right;
        return -1;
    }
    public static void main(String[] args) {
        int[] test = {1 , 3, 3, 3, 5, 6};
        System.out.println(Arrays.toString(test));
    }

}
