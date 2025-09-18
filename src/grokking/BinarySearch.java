package grokking;

public class BinarySearch {

    private final int[] BinarySearchTestArr1 = {1, 2, 3, 11, 33, 44, 66, 67, 68, 101, 102, 104, 111, 122, 200, 300, 400, 401};
    public int useBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Length of Array: " + arr.length);

        while (low <= high) {
            int mid = (high + low) / 2;
            int isTarget = arr[mid];

            if (isTarget == target) {
                return mid;
            } else if (target < isTarget) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int[] getBinarySearchTestArr1() {
        return BinarySearchTestArr1;
    }
}
