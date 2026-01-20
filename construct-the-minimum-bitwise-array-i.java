class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[] = new int[nums.size()];
        for(int i = 0; i < ans.length; i++){
            int x = nums.get(i);
            int trailingOnes = Integer.numberOfTrailingZeros(~x);
            if(trailingOnes == 0){
                ans[i] = -1;
            }else{
                ans[i] = x & ~(1 << trailingOnes - 1);
            }
        }return ans;
    }
}