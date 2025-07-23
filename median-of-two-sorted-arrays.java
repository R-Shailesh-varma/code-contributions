class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        boolean isEven = (totalLength % 2 == 0);
        int midIndex1 = totalLength / 2;
        int midIndex2 = isEven ? midIndex1 - 1 : midIndex1;

        int i = 0, j = 0;
        int count = 0;
        int curr = 0, prev = 0;
        double ans = 0;
        while (count <= midIndex1) {
            prev = curr;
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
            count++;
        }

        if (isEven) {
            ans = (prev + curr) / 2.0;
        } else {
            ans = curr;
        }
        return ans;
    }
}
