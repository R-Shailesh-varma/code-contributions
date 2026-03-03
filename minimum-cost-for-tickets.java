class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length];
        return helper(days, dp, costs, 0);
    }private int helper(int[] days, int[] dp, int[] cost, int cur){
        if(cur >= days.length) return 0;
        if(dp[cur] != 0) return dp[cur];
        int oneDayPlan = cost[0] + helper(days, dp, cost, cur+1);
        
        int sd = days[cur] + 6;
        int j = cur;
        while(j < days.length && days[j] <= sd){
            j++;
        }
        int sevenDays = cost[1] + helper(days, dp, cost, j);
        
        int td = days[cur] + 29;
        j = cur;
        while(j < days.length && days[j] <= td){
            j++;
        }
        int thirDays = cost[2] + helper(days, dp, cost, j);
        
        dp[cur] = Math.min(sevenDays, Math.min(thirDays, oneDayPlan));
        return dp[cur];
        
    }
}