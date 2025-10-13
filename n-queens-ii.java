class Solution {
    int solutions = 0;
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        NQueens(board, 0, n);
        return solutions;
    }void NQueens(boolean[][] board, int level, int n){
        if(level == n){
            solutions++;
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, level, i)){
                board[level][i] = true;
                NQueens(board, level+1, n);
                board[level][i] = false;
            }
        }return;
    }boolean isSafe(boolean[][] board, int r, int c){
        for(int i = 0; i < r; i++){
            if(board[i][c] == true) return false;
        }for(int i = r, j = c; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == true) return false;
        }for(int i = r, j = c; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == true) return false;
        }return true;
    }
}