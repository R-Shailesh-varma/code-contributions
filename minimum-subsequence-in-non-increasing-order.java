class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        List<Integer> res = new ArrayList<>();
        int curSum = 0;
        for(int i = nums.length-1; i >= 0; i--){
            curSum += nums[i];
            sum -= nums[i];
            res.add(nums[i]);
            if(curSum > sum){
                return res;
            }
        }return new ArrayList<>();
    }
}