class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        k=[]
        for i in range(len(nums)):
            if nums[i]==val:
                k.append(i)
        for i in reversed(k):
            nums.pop(i)
