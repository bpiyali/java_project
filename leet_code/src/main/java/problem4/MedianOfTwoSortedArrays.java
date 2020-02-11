package problem4;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    private static double findMedian(int arr[], int len) {
        // check for odd case
        if (len % 2 != 0)
            return (double) arr[len / 2];

        return (double) (arr[(len - 1) / 2] + arr[len / 2]) / 2.0;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;

        double num1Median = findMedian(nums1, num1Len);
        double num2Median = findMedian(nums2, num2Len);

        return (num1Median + num2Median) /2;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 1, 2, 3, 4, 5, 6, 8, 9, 12, 15, 20 };

        System.out.println("median"+ findMedianSortedArrays(a, b));
    }
}
