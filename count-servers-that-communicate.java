class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int servers = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0){
                    grid[i][j] = servers++;
                }else{
                    grid[i][j] = -1;
                }
            }
        }

        DSU serGrid = new DSU(servers);

        for(int i = 0; i < n; i++){
            int first = -1;
            for(int j = 0; j < m; j++){
                if(grid[i][j] != -1){
                    if(first == -1){
                        first = grid[i][j];
                    }else{
                        serGrid.union(first, grid[i][j]);
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            int first = -1;
            for(int j = 0; j < n; j++){
                if(grid[j][i] != -1){
                    if(first == -1){
                        first = grid[j][i];
                    }else{
                        serGrid.union(first, grid[j][i]);
                    }
                }
            }
        }

        return serGrid.countCommunicating();

    }
}class DSU{
    int[] parent;
    int[] size;
    DSU(int x){
        parent = new int[x];
        size = new int[x];
        for(int i = 0; i < x; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int num){
        if(parent[num] != num){
            parent[num] = find(parent[num]);
        }return parent[num];
    }

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX == rootY) return;
        if(rootX < rootY){
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }else{
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        }
    }

    public int countCommunicating() {
        int result = 0;
        for (int i = 0; i < size.length; i++) {
            if (parent[i] == i && size[i] > 1) {
                result += size[i];
            }
        }
        return result;
    }

}