from collections import Counter

class Solution(object):
    def countWords(self, words1, words2):
        count1 = Counter(words1)
        count2 = Counter(words2)
        result = 0
        for word in count1:
            if count1[word] == 1 and count1[word] == count2.get(word, 0):
                result += 1
        return result
