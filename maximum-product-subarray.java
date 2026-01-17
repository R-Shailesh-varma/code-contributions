class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int mi = min*nums[i];
            int ma = max*nums[i];
            min = Math.min( nums[i], Math.min(mi, ma));
            max = Math.max( nums[i] , Math.max(mi, ma));
            ans = Math.max(max, ans);
        }
        return ans;
    }
}