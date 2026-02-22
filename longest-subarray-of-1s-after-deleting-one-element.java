class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        int l = 0;
        int max = 0;
        int[] freq = new int[2];
        
        for(int i = 0; i < n; i++){
            freq[nums[i]]++;
            while(freq[0] > 1){
                freq[nums[l]]--;
                l++;
            }
            max = Math.max(max, (freq[0] + freq[1] - 1));
        }
        return max;
    }
}