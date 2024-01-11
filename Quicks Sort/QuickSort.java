import java.util.Arrays;

public class QuickSort {

    public int[] quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            quicksort(arr, start, index - 1);
            quicksort(arr, index, end);
        }
        return arr;
    }

    public int partition(int[] arr, int leftIndex, int rightIndex) {
        int pivot = arr[(leftIndex + rightIndex) / 2];
        System.out.println("The pivot value is: " + pivot);

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                System.out.println("Swapping " + arr[leftIndex] + " and " + arr[rightIndex]);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 5, 2, 90, 4, 7};
        QuickSort sorter = new QuickSort();
        System.out.println(Arrays.toString(sorter.quicksort(inputArr, 0, inputArr.length - 1)));
    }
}
