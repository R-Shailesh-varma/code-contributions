class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        if(grid[0][0] <= k) count++;
        for(int i = 1; i < n; i++){
            grid[i][0] += grid[i-1][0];
            if(grid[i][0] <= k) count++;
            // else break;
        }

        for(int i = 1; i < m; i++){
            grid[0][i] += grid[0][i-1];
            if(grid[0][i] <= k) count++;
            // else break;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                grid[i][j] += (grid[i-1][j] + grid[i][j-1] - grid[i-1][j-1]);
                if(grid[i][j] <= k) count++;
                // else break;
            }
        }
        return count;

    }
}