class Solution {
    static final int INF = 99999;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = INF;
                break;
            }dp[i][0] = 1;
        }for(int i = 0; i < n; i++){
            if(obstacleGrid[0][i] == 1){
                dp[0][i] = INF;
                break;
            }dp[0][i] = 1;
        }for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = INF;
                    continue;
                }
                int top = dp[i-1][j] == INF ? 0: dp[i-1][j];
                int left = dp[i][j-1] == INF ? 0: dp[i][j-1];
                dp[i][j] = top + left;
            }
        }return dp[m-1][n-1] == INF ? 0 : dp[m-1][n-1];
    }
}