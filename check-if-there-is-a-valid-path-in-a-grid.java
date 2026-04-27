class Solution {
    int[][][] dirs = {
        {{0, 0}, {0, 0}},
        {{0, -1}, {0, 1}},
        {{1, 0}, {-1, 0}},
        {{0, -1}, {1, 0}},
        {{0, 1}, {1, 0}},
        {{0, -1}, {-1, 0}},
        {{0, 1}, {-1, 0}},
    };

    int[][][] valid = {
        {{0, 0, 0}, {0, 0, 0}},
        {{1, 4, 6}, {1, 3, 5}},
        {{2, 5, 6}, {2, 3, 4}},
        {{1, 4, 6}, {2, 5, 6}},
        {{1, 3, 5}, {2, 5, 6}},
        {{1, 4, 6}, {2, 3, 4}},
        {{1, 3, 5}, {2, 3, 4}},
    };

    public boolean hasValidPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int val = grid[cur[0]][cur[1]];
            int c = 0;
            for (int[] dir : dirs[val]) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (isValid(vis, grid, x, y, val, c)) {
                    vis[x][y] = true;
                    q.offer(new int[]{x, y});
                }
                c++;
            }
        }
        return vis[n - 1][m - 1];
    }

    boolean isValid(boolean[][] vis, int[][] grid, int x, int y, int val, int c) {
        if (x >= grid.length || x < 0 || y < 0 || y >= grid[0].length || vis[x][y]) return false;
        int cur = grid[x][y];
        for (int i : valid[val][c]) {
            if (i == cur) return true;
        }
        return false;
    }
}