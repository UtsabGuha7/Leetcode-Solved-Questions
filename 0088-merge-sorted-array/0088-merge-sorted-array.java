import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1. Fill the empty slots of nums1 with nums2 elements
        // The empty slots in nums1 start exactly at index 'm'
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        
        // 2. Sort the combined array
        // This handles duplicates and orders everything perfectly!
        Arrays.sort(nums1);
    }
}