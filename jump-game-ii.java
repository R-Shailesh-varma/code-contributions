class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        solve(nums, dp, n-2);
        return dp[0];
    }public void solve(int[] nums, int[] dp, int srt){
        for(int i = srt; i >= 0; i--){
            if(nums[i] == 0){
                dp[i] = Integer.MAX_VALUE;
                continue;
            }else if(nums[i] + i >= srt+1){
                dp[i] = 1;
                continue;
            }else{
                dp[i] = findMin(dp, i, i + nums[i]) + 1;
            }
        }
    }public int findMin(int[] dp, int stp, int srt){
        int min = Integer.MAX_VALUE;
        for(int i = srt; i > stp; i--){
            min = Math.min(dp[i], min);
        }return (min == Integer.MAX_VALUE) ? Integer.MAX_VALUE - 2 : min;
    }
}