class Solution(object):
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num%2 !=0:
            return False
        i=2
        c=1
        j=num//2
        while i<j:
            if num%i==0:  
                c+=i
            if num%j==0:
                c+=j
            i+=1
            j-=1
        return c==num
        