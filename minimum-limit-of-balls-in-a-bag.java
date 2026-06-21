class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int r = 0;
        for(int i : nums){
            r = Math.max(i, r);
        }

        int l = 1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(isValid(nums, maxOperations, mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }private boolean isValid(int[] nums, int ops, int mid){
        int count = 0;
        for(int i: nums){
            count += (i - 1)/mid;
        }
        return count <= ops;
    }
}