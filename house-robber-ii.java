class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        return Math.max(robHouses(nums, 0, n-1), robHouses(nums, 1, n));
    }public int robHouses(int[] nums, int start, int end){
        int rob1 = 0;
        int rob2 = 0;
        int max = 0;
        for(int i = start; i < end; i++){
            max = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }return max;
    }
}