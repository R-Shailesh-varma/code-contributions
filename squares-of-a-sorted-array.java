class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left = 0, right = nums.length-1  ,pos = nums.length - 1;
        while(pos >= 0){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[pos--] = nums[left]* nums[left];
                left++;
            }else{
                res[pos--] = nums[right]* nums[right];
                right--;
            }
        }return res;
    }
}