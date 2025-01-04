class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        cs = nums[0]+nums[1]+nums[2]
        for i in range(0,len(nums)-2):
            k=i+1
            j=len(nums)-1
            while k<j:
                v=nums[i]+nums[j]+nums[k]
                if abs(target-v)<abs(target-cs):
                    cs=v
                if v<target:
                    k+=1
                elif v>target:
                    j-=1
                else :
                    return v 
        return cs
        