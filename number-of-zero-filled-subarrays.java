class Solution {
    public long zeroFilledSubarray(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        long sum = 0;
        for(int i: nums){
            if(i == 0){
                count++;
                sum += count;
            }else{
                count = 0;
            }
        }return sum;
    }
}