class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s=s.lower()
        k=[]
        for i in s:
            if i.isalnum():
                k.append(i)
        return k[::]==k[::-1]
        
