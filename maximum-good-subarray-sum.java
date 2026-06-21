class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();

        long sum = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + k)) {
                ans = Math.max(ans, sum + nums[i] - map.get(nums[i] + k));
            }
            if (map.containsKey(nums[i] - k)) {
                ans = Math.max(ans, sum + nums[i] - map.get(nums[i] - k));
            }
            map.put(nums[i], Math.min(map.getOrDefault(nums[i], Long.MAX_VALUE), sum));
            sum += nums[i];
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}