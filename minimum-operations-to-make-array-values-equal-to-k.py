class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if(k > min(nums)):
            return -1
        unique_ele = set(nums)
        unique_cnt = len(unique_ele)

        if k in unique_ele:
            return unique_cnt - 1
        else:
            return unique_cnt
        