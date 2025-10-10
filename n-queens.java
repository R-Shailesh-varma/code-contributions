class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        helper(board, 0, n);
        return ans;
    }boolean helper(int[][] board, int queen, int n){
        if(queen == n){
            List<String> sol = new ArrayList<>();
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n; j++){
                    if(board[i][j] == 1){
                        sb.append("Q");
                    }else{
                        sb.append(".");
                    }
                }sol.add(sb.toString());
            }ans.add(sol);
            return true;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board, queen, col, n)){
                board[queen][col] = 1;
                helper(board, queen+1, n);
                board[queen][col] = 0;
            }
        }return false;
    }
    boolean isSafe(int[][] board, int r, int c, int n){
        for(int i = 0; i < r; i++){
            if(board[i][c] == 1) return false;
        }for(int i = r, j = c; i >= 0 && j >=0; i--, j--){
            if(board[i][j] == 1)return false;
        }for(int i = r, j = c; i >=0 && j < n; i--, j++){
            if(board[i][j] == 1)return false;
        }return true;
    }
}