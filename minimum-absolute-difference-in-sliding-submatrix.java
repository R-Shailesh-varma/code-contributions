class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] ng = new int[n - k + 1][m - k + 1];

        for(int i = 0; i <= n - k; i++){
            for(int j = 0; j <= m - k; j++){
                ng[i][j] = computeMin(grid, i, j, k);
            }
        }

        return ng;
    }

    int computeMin(int[][] grid, int x, int y, int k){
        if(k == 1) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i = x; i < x + k; i++){
            for(int j = y; j < y + k; j++){
                set.add(grid[i][j]); 
            }
        }
        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < arr.size(); i++){
            ans = Math.min(ans, arr.get(i) - arr.get(i - 1));
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}