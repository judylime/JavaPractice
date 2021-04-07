package AlgorithmBasic.Sorting;

public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        int i = 0, j = 0, k = array.length - 1;
        while (j <= k) {
            if (array[j] == 1) { // array[j].gpa < 60
                swap(array, i ,j);
                i++;
                j++;
            } else if (array[j] == 2) { // array[j].gpa > 90
                j++;
            } else { //array[j] != 1 && array[j] != 2
                swap(array, j, k);
                k--; // can we do j++ ???
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
