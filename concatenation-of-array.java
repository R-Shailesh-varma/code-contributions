class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if(n == 0) return nums;
        int[] newNums = new int[2*n];
        for(int i = 0; i < n; i++){
            newNums[i] = nums[i];
            newNums[i+n] = nums[i];
        }
        return newNums;
    }
}