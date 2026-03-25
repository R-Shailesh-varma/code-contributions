class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] horSum = new int[n];
        int[] verSum = new int[m];
        long total = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                horSum[i] += grid[i][j];
                verSum[j] += grid[i][j];
                total += grid[i][j];
            }
        }

        return helper(horSum, total) || helper(verSum, total);
    }
    boolean helper(int[] arr, long total){
        int n = arr.length;
        long pre = 0;
        for(int i = 0; i < n; i++){
            pre += arr[i];
            if(pre == (total - pre)) return true;
        }return false;
    }
}