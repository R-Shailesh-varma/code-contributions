class Solution {
    int m;
    int n;
    int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}}; 
    public void gameOfLife(int[][] board) {
        m = board.length;
        n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = solve(board, i, j);
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = board[i][j] / 2;
            }
        }

    }private int solve(int[][] board, int i, int j){
        int count = 0;
        for(int[] dir: dirs){
            int x = i + dir[0];
            int y = j + dir[1];
            if(x >= 0 && x < m && y >= 0 && y < n){
                count += board[x][y]%2;
            }
        }
        if(board[i][j] == 1){ 
            if(count == 2 || count == 3) return 3;
            else return 1; 
        } else {
            if(count == 3) return 2;
            else return 0;
        }
    }
}