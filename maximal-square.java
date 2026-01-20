class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, matrix[i][0] - '0');
        }
        for (int j = 0; j < m; j++) {
            max = Math.max(max, matrix[0][j] - '0');
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == '1'){
                    int top = matrix[i-1][j] - '0';
                    int left = matrix[i][j-1] - '0';
                    int topLeft = matrix[i-1][j-1] - '0';
                    
                    int cur = Math.min(top, Math.min(left, topLeft)) + 1;
                    matrix[i][j] = (char) (cur + '0');

                    max = Math.max(max, cur);
                }
            }
        }return max*max;
    }
}