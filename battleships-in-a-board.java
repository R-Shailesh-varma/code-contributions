class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X' && !isStart(board, i, j)) ans++;
            }
        }return ans;
    }private boolean isStart(char[][] board, int x, int y){
        return ( (x-1 >= 0 && board[x-1][y] == 'X') || (y-1 >= 0 && board[x][y-1] == 'X'));
    }
}