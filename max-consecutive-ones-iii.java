class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] freq = new int[2];
        int start = 0;
        int len = 0;
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
            while(freq[0] > k){
                freq[nums[start]]--;
                start++;
            }
            max = Math.max(max, freq[0]+freq[1]);
        }
        return max;
    }
}