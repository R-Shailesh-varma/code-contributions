class Solution {
    public int[][] floodFill(int[][] images, int sr, int sc, int color) {
        int val = images[sr][sc];
        if (val == color) return images;
        images[sr][sc] = color;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});
        int[][] dirs = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()){
            int[] c = q.poll();
            for(int[] d: dirs){
                int nr = c[0] + d[0];
                int nc = c[1] + d[1];
                if(nr >= 0 && nc >= 0 && nr < images.length && nc < images[0].length && images[nr][nc]==val){
                    q.offer(new int[]{nr, nc});
                    images[nr][nc] = color;
                }
            }
        }return images;
    }
}