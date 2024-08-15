class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        n=[1,4,5,9,10,40,50,90,100,400,500,900,1000]
        s=["I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"]
        i=12
        t=""
        while num:
            div=num//n[i]
            num=num%n[i]
            while div:
                t+=s[i]
                div-=1
            i-=1
        return (t) 
                
