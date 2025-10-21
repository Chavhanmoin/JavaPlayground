package Lecture;

public class OrderAgnoBS {

    public static void main(String[] args) {
        int[] ascArr = {1, 3, 5, 7, 9, 11, 13};
        int[] descArr = {99, 88, 77, 66, 55, 44, 33};

        int target = 11;

        int ascResult = orderAgnosticBinarySearch(ascArr, target);
        int descResult = orderAgnosticBinarySearch(descArr, target);

        System.out.println("In Ascending Array: Index = " + ascResult);
        System.out.println("In Descending Array: Index = " + descResult);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check the sorting order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // not found
    }
}
