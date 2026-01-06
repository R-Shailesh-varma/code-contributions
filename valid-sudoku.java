class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.' && !isValid(board, i, j)) return false;
            }
        }return true;
    }public boolean isValid(char[][] board, int row, int col){
        for(int i = 0; i < board.length; i++) if( i!=row && board[i][col] == board[row][col]) return false;
        for(int i = 0; i < board.length; i++) if( i!=col && board[row][i] == board[row][col]) return false;
        int a = (row/3)*3;
        int b = (col/3)*3;
        for(int i = a; i < a+3; i++){
            for(int j = b; j < b+3; j++){
                if(i != row && j != col && board[i][j] == board[row][col]) return false;
            }
        }return true;
    }
}