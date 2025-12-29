class Solution {
    public void solve(char[][] board) {
        for(int i = 0; i < board[0].length; i++){
            if(board[0][i] == 'O') bfs(board, 0, i);
        }for(int i = 0; i < board[0].length; i++){
            if(board[board.length - 1][i] == 'O') bfs(board, board.length - 1, i);
        }for(int i = 0; i < board.length; i++){
            if(board[i][0] == 'O') bfs(board, i, 0);
        }for(int i = 0; i < board.length; i++){
            if(board[i][board[0].length - 1] == 'O')  bfs(board, i, board[0].length - 1);
        }for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'N'){
                    board[i][j] = 'O';
                }else{
                    board[i][j] = 'X';
                }
            }
        }
    }public void bfs(char[][] board, int row, int col){
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{row, col});
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        board[row][col] = 'N';
        while(!q.isEmpty()){
            int[] c = q.poll();
            for(int[] d: dirs){
                int nr = c[0]+d[0];
                int nc = c[1]+d[1];
                if(nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length && board[nr][nc] == 'O'){
                    board[nr][nc] = 'N';
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}