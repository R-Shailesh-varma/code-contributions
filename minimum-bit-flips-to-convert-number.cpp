class Solution(object):
    def minBitFlips(self, start, goal):
        """
        :type start: int
        :type goal: int
        :rtype: int
        """
        # s1=(bin(start))[2:]
        # s2=(bin(goal))[2:]
        # s1=s1[::-1]
        # s2=s2[::-1]
        s1 = bin(start)[2:][::-1]
        s2 = bin(goal)[2:][::-1]
        
        max_len = max(len(s1), len(s2))
        
        k = s2[len(s1):].count('1')
        
        for i in range(len(s1)):
            bit1 = s1[i] if i < len(s1) else '0'
            bit2 = s2[i] if i < len(s2) else '0'
            if bit1 != bit2:
                k += 1
        
        return k

