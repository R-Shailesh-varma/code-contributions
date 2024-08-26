class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x>=(2**(30)-1)or x<=(-2**30)):
            return 0
        if x>0:
            u=str(x)
            u=u[::-1]
            return int(u)
        else:
            u=str(-1*x)
            u=u[::-1]
            return (int(u)*(-1))
       
