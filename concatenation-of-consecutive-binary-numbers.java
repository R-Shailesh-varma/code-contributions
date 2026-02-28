class Solution {
    static final int MOD = 1_000_000_007;
    public int concatenatedBinary(int n) {
        return helper(1, n, 0L);
    }
    int helper(int i, int n, long k){
        if(i > n) return (int) k;
        int temp = i;
        int length = 0;
        while(temp > 0){
            length++;
            temp = temp >> 1;
        }
        k = ((k << length) + i) % MOD;
        return helper(i+1, n, k);
    }
}