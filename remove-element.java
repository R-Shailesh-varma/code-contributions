class Solution {
    public int removeElement(int[] nums, int val) {
        int poi = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]!= val){
                nums[poi] = nums[i];
                poi++;
            }
        }return poi;
    }
}