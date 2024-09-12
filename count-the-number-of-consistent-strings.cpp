class Solution(object):
    def countConsistentStrings(self, allowed, words):
        """
        :type allowed: str
        :type words: List[str]
        :rtype: int
        """
        aws=set(allowed)
        c = 0
        for i in words:
            k=1
            for j in i:
                if j not in aws:
                    k=0
                    break
            c+=k
        return c 