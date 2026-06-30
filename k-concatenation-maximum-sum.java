class Solution {
    static final int MOD = 1000000007;
    public int kConcatenationMaxSum(int[] arr, int k) {
        long totalSum = 0;
        for(int i: arr) totalSum += i;
        long maxSum = kadane(arr, Math.min(2, k));
        if(k == 1){
            return (int) (maxSum % MOD);
        }

        if(totalSum > 0){
            maxSum += (k - 2) * totalSum;
        }

        return (int) (maxSum % MOD);
    }
    long kadane(int[] arr, int k){
        long count = 0;
        long curSum = 0;
        long ans = 0;
        while(count < k){
            for(int i = 0; i < arr.length; i++){
                curSum = (curSum + arr[i]);
                if(curSum < 0) {
                    curSum = 0;
                }
                ans = Math.max(ans, curSum);
            }
            count++;
        }
        return ans;
    }
}