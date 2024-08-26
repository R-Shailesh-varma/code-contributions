class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        l=[]
        for i in range(left,right+1):
            x=str(i)
            t=0
            if '0' in x:
                continue
            for j in x:
                o=int(j)
                if i% o==0:
                    t+=1
            if t==len(x):
                l.append(i)
        return l