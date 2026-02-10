class Solution {
    int[][] dirs = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        int n = grid.length;
        int cell = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int[] dir: dirs){
                int nx = cur[0] + dir[0];
                int ny = cur[1] + dir[1];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] == cell){
                    q.offer(new int[]{nx, ny});
                    cell++;
                } 
            }
        }return cell == n*n;
    }
}