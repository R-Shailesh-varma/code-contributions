class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0 || n == 0) return 0;
        if(m == 1 && n == 1) return matrix[0][0];
        solve(matrix, 1, 0, m, n);
        for(int i = 0; i < n; i++){
            min = Math.min(matrix[m-1][i], min);
        }
        return min;
    }public void solve(int[][] matrix, int i, int j, int m, int n){
        for(int row = i; row < m; row++){
            for(int col = j; col < n; col++){
                calculate(matrix, row, col, m, n);
            }
        }    
    }public void calculate(int[][] matrix, int row, int col, int m, int n){
        int topLeft = (col == 0) ? Integer.MAX_VALUE: matrix[row-1][col-1];
        int top = matrix[row-1][col];
        int topRight = (col == n-1) ? Integer.MAX_VALUE: matrix[row-1][col+1];
        matrix[row][col] += Math.min(Math.min(topLeft, topRight), top);
        return;
    }
}