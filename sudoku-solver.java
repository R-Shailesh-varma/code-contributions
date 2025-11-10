class Solution {
    boolean isSafe(char[][] board, int row, int col, char target){
        for(int i = 0; i < 9; i++){
            if(board[i][col] == target){
                return false;
            }
        }for(int j = 0; j < 9; j++){
            if(board[row][j] == target){
                return false;
            }
        }for(int i = 3*(row/3); i < 3*(row/3)+3; i++){
            for(int j = 3*(col/3); j < 3*(col/3)+3; j++){
                if(board[i][j] == target){
                    return false;
                }
            }
        }return true;
    }
    public boolean solve(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(!isSafe(board, i, j, c)) continue;
                        board[i][j] = c;
                        if(solve(board)){
                            return true;
                        }board[i][j] = '.';
                    }return false;
                }
            }
        }return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}