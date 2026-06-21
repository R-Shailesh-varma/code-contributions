class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        int n = pattern.length;
        for(int i = 0; i < nums.length - n; i++){
            if(isValid(i, nums, pattern)) count++;
        }
        return count;
    }private boolean isValid(int i, int[] nums, int[] pattern){
        for(int k = 0; k < pattern.length; k++){
            if(pattern[k] == 1 && !(nums[i + k + 1] > nums[i + k])) return false;
            else if(pattern[k] == 0 && !(nums[i + k + 1] == nums[i + k])) return false;
            else if(pattern[k] == -1 && !(nums[i + k + 1] < nums[i + k])) return false;
        }
        return true;
    }
}