class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int j = 0;
        for(int i = 0; i < n; i++){
            while(j < n && nums[j] <= (long) nums[i]*k) j++;
            ans = Math.min(ans, (n - (j-i)));
        }
        return ans;
    }
}