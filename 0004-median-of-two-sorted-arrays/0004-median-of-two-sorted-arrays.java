class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum=0.0;
    int[] concatenatedArray = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, concatenatedArray, 0, nums1.length);
    System.arraycopy(nums2, 0, concatenatedArray, nums1.length, nums2.length);
 
    Arrays.sort(concatenatedArray);
     int total = concatenatedArray.length;
    if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) concatenatedArray[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = concatenatedArray[total / 2 - 1];
            int middle2 = concatenatedArray[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}