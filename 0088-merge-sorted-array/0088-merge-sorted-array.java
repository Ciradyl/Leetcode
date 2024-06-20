

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int middle = m + n - 1;
        
        while(left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
            	nums1[middle--] = nums1[left--];
            } else {
            	nums1[middle--] = nums2[right--];
            }
        }
        
        while (left >= 0) {
            nums1[middle--] = nums1[left--];
        }
        
        while (right >= 0) {
            nums1[middle--] = nums2[right--];
        }
    }
}