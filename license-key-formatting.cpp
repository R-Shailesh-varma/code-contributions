class Solution(object):
    def licenseKeyFormatting(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        s=s.replace("-","")
        s=s.upper()
        l=[]
        n=len(s)%k
        if n!=0:
            l.append(s[:n])
        for i in range(n,len(s),k):
            l.append(s[i:i+k])
        r="-".join(l)
        return(r)