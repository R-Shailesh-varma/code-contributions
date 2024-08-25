class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        s=nums1+nums2
        s=sorted(s)
        l=len(s)
        if(l%2!=0):
            return s[l/2]
        else:
            return (float((s[(l-1)/2] +s[(l+1)/2])/2.0))