class Solution(object):
    def maxScore(self, s):
        l = len(s)
        max=0
        for i in range (1,l) :
            m = s[:i].count('0') + s[i:].count('1')
            if (m> max):
                max = m
        return max