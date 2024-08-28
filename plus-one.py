class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        k=int("".join(map(str,digits)))
        k+=1
        return map(int,(list(str(k))))
