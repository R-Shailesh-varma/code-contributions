class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        k=0
        for i in jewels:
            k+=stones.count(i)
        return k
