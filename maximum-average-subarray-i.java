class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for(int i = 0; i < k-1; i++){
            sum += nums[i];
        }for(int i = k-1; i < nums.length; i++){
            sum += nums[i];
            ans = Math.max(ans, sum/k);
            sum -= nums[i-k+1];
        }return ans;
    }
}