class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        p=set(ransomNote)
        q=set(magazine)
        b=True
        for i in p:
            if i in q and ransomNote.count(i)<=magazine.count(i):
                b=True
            else:
                b=False
                break
        return b        
