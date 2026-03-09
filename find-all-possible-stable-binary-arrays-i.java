class Solution {
    static final int mod = 1000000007;
    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][][] dp = new long[zero+1][one+1][2];
        boolean[][][] vis = new boolean[zero+1][one+1][2];
        long ans = (helper(dp, vis, zero, one, limit, 0) + helper(dp, vis, zero, one, limit, 1)) % mod;
        return (int) ans; 
    }

    private long helper(long[][][] dp, boolean[][][] vis, int zero, int one, int limit, int curr){
        if(zero == 0 && one == 0){
            return 1;
        }
        if(zero < 0 || one < 0)return 0;

        if(vis[zero][one][curr]) return dp[zero][one][curr];
        vis[zero][one][curr] = true;
        
        if(curr == 1){
            for(int i = 1; i <= limit; i++){
                dp[zero][one][curr] = (dp[zero][one][curr] + helper(dp, vis, zero, one - i, limit, 0)) % mod;
            }
        }else{
            for(int i = 1; i <= limit; i++){
                dp[zero][one][curr] = (dp[zero][one][curr] + helper(dp, vis, zero - i, one, limit, 1)) % mod;
            }
        }
        return dp[zero][one][curr];
    }
}