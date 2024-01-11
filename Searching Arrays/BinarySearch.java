public class BinarySearch {

    public static int search(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1; 

        while (right >= left) { 
            int mid = (left + right) / 2;
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            } else if (target > midValue) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        int result = search(searchable, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
