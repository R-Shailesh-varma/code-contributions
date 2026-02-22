class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        for(int i = 0; i < nums.length + 1; i++){
            xor1 ^= i;
        }

        int xor2 = 0;
        for(int j = 0; j < nums.length; j++){
            xor2 ^= nums[j];
        }

        return xor1 ^ xor2;
    }
}