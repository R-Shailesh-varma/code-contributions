class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int size = nums.size();
        int[] ans = new int[size    ];
        for(int i = 0; i < size; i++){
            int x = nums.get(i);
            int trailingOnes = Integer.numberOfTrailingZeros(~x);
            if(trailingOnes == 0){
                ans[i] = -1;
                continue;
            }
            ans[i] = x & ~(1 << trailingOnes - 1);
        }return ans;
    }
}