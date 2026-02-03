class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        int n = nums.length;

        //Uphill
        while(i < n-1 && nums[i] < nums[i+1]){
            i++;
        }
        if(i == n-1 || i == 0) return false;

        //DownHill
        while(i < n-1 && nums[i] > nums[i+1]){
            i++;
        }
        if(i == n-1) return false;

        while(i < n-1 && nums[i] < nums[i+1]){
            i++;
        }
        return i == n-1;
    }
}