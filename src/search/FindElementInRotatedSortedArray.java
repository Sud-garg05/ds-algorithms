package search;

/**
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
 * So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
 *
 * sortedPivotedArray
 *
 * Example:
 *
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
 *          key = 3
 * Output : Found at index 8
 *
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
 *          key = 30
 * Output : Not found
 *
 * Input : arr[] = {30, 40, 50, 10, 20}
 *         key = 10
 * Output : Found at index 3
 */
public class FindElementInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(find(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3));
        System.out.println(find(new int[]{5, 6, 7, 8, 9, 10, 11, 2, 3}, 3));
        System.out.println(find(new int[]{5, 16, 17, 18, 1, 2, 3}, 3));
    }

    private static int find(int[] array, int k) {
        int pivot = FindPivotInRotatedSortedArray.findPivot(array);
        int index = binarySearch(array, k, 0, pivot);
        if (index != -1){
            return index;
        }
        return binarySearch(array, k, pivot+1, array.length-1);
    }

    private static int binarySearch(int[] array, int k, int low, int high) {
        while (low<=high){
            int mid = (low+high)/2;
            if (array[mid] == k){
                return mid;
            } else if (k > array[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
