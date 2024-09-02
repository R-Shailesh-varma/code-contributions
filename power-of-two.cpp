class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        k=str(bin(n))
        return (k.count("1")==1 and n>0)