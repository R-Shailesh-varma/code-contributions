class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int i: nums){
            max = Math.max(max, i);
        }int currLen = 0;
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                currLen++;
            }else{
                maxLen = Math.max(maxLen, currLen);
                currLen = 0;
            }
        }maxLen = Math.max(maxLen, currLen);
        return maxLen;
    }
}