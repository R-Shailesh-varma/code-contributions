class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k=0
        for i in (set(nums)):
            if k < nums.count(i):
                u=i
                k=max(k,nums.count(i))
        return u
