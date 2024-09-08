class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vo="AEIOUaeiou"
        l=[]
        ind=[]
        for i in range(len(s)):
            if s[i] in vo:
                l.append(s[i])
                ind.append(i)
        k=list(s)
        l[:]=l[::-1]
        for i in range(len(l)):
            k[ind[i]]=l[i]
        o="".join(k)
        return o
