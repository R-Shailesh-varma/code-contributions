class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        v=0
        h=0
        for i in moves.upper():
            if i=='U':
                v+=1
            elif i=='D':
                v-=1
            elif i=='R':
                h+=1
            elif i=='L':
                h-=1
            else:
                return False
        return (v==0 and h==0)