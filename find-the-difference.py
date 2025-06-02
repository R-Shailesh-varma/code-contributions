class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        ch = ""
        d1 = dict()
        for i in s:
            if i in d1:
                d1[i] += 1
            else:
                d1[i] = 1
        
        d2 = dict()
        for i in t:
            if i in d2:
                d2[i] += 1
            else:
                d2[i] = 1
        for i in d2:
            if d2[i] != d1.get(i, 0):
                ch = i
                break
        return ch