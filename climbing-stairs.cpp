class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=1
        b=2
        for i in range(n-1):
            c=a+b
            a=b
            b=c
        return a
        