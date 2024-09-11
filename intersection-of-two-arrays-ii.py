class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        k=[]
        for i in nums2:
            if i in nums1:
                k.append(i)
                nums1.remove(i)
        return k
