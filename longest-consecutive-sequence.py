class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)== 0:
            return 0
        s = list(set(nums))
        s = sorted(s)
        maxn = 1
        count = 1
        for i in range(len(s)-1):
            if(s[i] == s[i+1]-1):
                count += 1
            else:
                maxn = max(maxn, count)
                count = 1
        maxn = max(maxn, count)
        return maxn