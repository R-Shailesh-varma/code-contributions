class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int n = grid[0].length , m = grid.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i] = Math.max(ans[i], num(grid[j][i]));
            }
        }
        
        return ans;

    }
    private int num(int n){
        int ans = (n <= 0) ? 1 : 0;
        n = Math.abs(n);
        while(n > 0){
            ans++;
            n = n/10;
        }
        return ans;
    }
}