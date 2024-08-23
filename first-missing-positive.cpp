class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        o=list(set(nums))
        if 1 in o:
            o.sort()
            k=0
            for i in range(len(o)-1):
                if o[i]>=0:
                    if o[i+1]==o[i]+1:
                        continue
                    else:
                        k=o[i]+1
                        break
                else:
                    continue
        else:
            k=1
        if k!=0:
            return k
        elif k==0:
            return (max(o)+1)