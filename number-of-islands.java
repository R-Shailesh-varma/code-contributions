class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dirs = {{1,0}, {-1,0}, {0, 1}, {0, -1}};
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    grid[i][j] = '0';
                    q.offer(new int[]{i, j});
                    while(!q.isEmpty()){
                        int[] indices = q.poll();
                        for(int[] dir: dirs){
                            int nr = indices[0] + dir[0];
                            int nc = indices[1] + dir[1];
                            if(nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == '1'){
                                q.offer(new int[]{nr, nc});
                                grid[nr][nc] = '0';
                            }
                        }
                    }
                }
            }
        }return count;
    }
}