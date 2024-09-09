class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        while len(str(num))>1:
            s=map(int,list(str(num)))
            num=sum(s)
        return num
