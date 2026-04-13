class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int val = nums[start];
        int l = start;
        int r = start + 1;
        int ans = Integer.MAX_VALUE;
        while(l >= 0 || r < nums.length){
            if(l >= 0 && nums[l] == target){
                ans = Math.abs(l - start);
                break;
            }else if(r < nums.length &&  nums[r] == target){
                ans = Math.abs(r - start);
                break;
            }l--;
            r++;
        }
        return ans;
    }
}