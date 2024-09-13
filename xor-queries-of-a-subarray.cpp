class Solution(object):
    def xorQueries(self, arr, queries):
        """
        :type arr: List[int]
        :type queries: List[List[int]]
        :rtype: List[int]
        """
        # l=[]
        # for i in queries:
        #     if i[0]==i[1]:
        #         l.append(arr[i[0]])
        #     else:
        #         k=arr[i[0]]
        #         for j in range(i[0]+1,i[1]+1,1):
        #             k^=arr[j]
        #         l.append(k)
        # return l
        
        n = len(arr)
        prefix_xor = [0] * n
        prefix_xor[0] = arr[0]
        for i in range(1, n):
            prefix_xor[i] = prefix_xor[i - 1] ^ arr[i]
        results = []
        for start, end in queries:
            if start == 0:
                result = prefix_xor[end]
            else:
                result = prefix_xor[end] ^ prefix_xor[start - 1]
            results.append(result)
        return results