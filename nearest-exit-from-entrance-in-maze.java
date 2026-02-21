class Solution {
    final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;
        maze[entrance[0]][entrance[1]] = '+';
        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] cur = q.poll();
                if(count > 0 && isBorder(cur, n, m)) return count;
                for(int[] dir: dirs){
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if(x >= 0 && y >= 0 && x < n && y < m && maze[x][y] == '.'){
                        q.offer(new int[]{x, y});
                        maze[x][y] = '+';
                    }
                }
            }count++;
        }
        return -1;
    }private boolean isBorder(int[] cur, int n, int m){
        if(cur[0] == 0 || cur[0] == n-1 || cur[1] == 0 || cur[1] == m-1) return true;
        return false;
    }
}