class Solution {
    int perimeter = 0;
    public int islandPerimeter(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    bfs(grid, i, j);
                    return perimeter;
                }
            }
        }
        return 0;
    }void bfs(int[][] grid, int r, int c){
        grid[r][c] = -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        int[][] dirs = {{1,0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!q.isEmpty()){
            int[] ind = q.poll();
            for(int[] dir : dirs){
                int nr = ind[0] + dir[0];
                int nc = ind[1] + dir[1];
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1){
                    q.offer(new int[]{nr, nc});
                    grid[nr][nc] = -1;
                }
            }for(int[] dir: dirs){
                int nr = ind[0] + dir[0];
                int nc = ind[1] + dir[1];
                if(nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length){
                    perimeter++;
    
                }else if(grid[nr][nc] == 0){
                    perimeter++;
                }
            }
        }
    }
}