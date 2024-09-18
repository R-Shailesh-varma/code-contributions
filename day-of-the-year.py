class Solution(object):
    def dayOfYear(self, date):
        """
        :type date: str
        :rtype: int
        """
        yr={
            "01":0,
            "02":31,
            "03":59,
            "04":90,
            "05":120,
            "06":151,
            "07":181,
            "08":212,
            "09":243,
            "10":273,
            "11":304,
            "12":334,
        }
        t=0
        k=date.split("-")
        if (int(k[0])%4==0 and int(k[0])%100!=0 )or int(k[0])%400==0:
            if  int(k[1])>2:
                t=1
        return(t+yr[k[1]]+int(k[2]))
