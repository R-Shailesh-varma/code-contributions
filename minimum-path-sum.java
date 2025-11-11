class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        return solve(m, n, 0, 0, dp, grid);
    }private int solve(int m, int n, int i, int j, int[][] dp, int[][] grid){
        if(i >= m || j >= n) return Integer.MAX_VALUE;
        if(i == m-1 && j == n-1) return grid[i][j];
        if(dp[i][j] != 0) return dp[i][j];

        int right = solve(m, n, i, j+1, dp, grid);
        int down = solve(m, n, i+1, j, dp, grid);
        dp[i][j] = grid[i][j] + Math.min(right, down);
        return dp[i][j];

    } 
}