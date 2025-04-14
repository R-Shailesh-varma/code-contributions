class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = s.split()
        s[:] = s[::-1]
        j = " ".join(s)
        return j