class Solution {
    final int MOD = 1000000007;

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        for (int[] q : queries) {
            int l = q[0], r = q[1], step = q[2], mul = q[3];

            for (int i = l; i <= r; i += step) {
                xor ^= nums[i]; 
                nums[i] = (int)((long)nums[i] * mul % MOD);
                xor ^= nums[i]; 
            }
        }

        return xor;
    }
}