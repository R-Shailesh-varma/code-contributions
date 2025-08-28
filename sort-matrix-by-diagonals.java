class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        if (n == 1) return grid;
        int[][] sol = new int[n][n];
        Map<List<Integer>, List<Integer>> map = new HashMap<>();
        for(int i = 1; i < n; i++){
            List<Integer> vals = new ArrayList<>();
            List<Integer> idx = new ArrayList<>();
            int row = 0;
            int col = i;
            idx.add(row);
            idx.add(col);
            while(row < n && col < n){
                vals.add(grid[row++][col++]);
            }Collections.sort(vals);
            map.put(idx, vals);
        }for(int i = 0; i < n; i++){
            List<Integer> vals = new ArrayList<>();
            List<Integer> idx = new ArrayList<>();
            int row = i;
            int col = 0;
            idx.add(row);
            idx.add(col);
            while(row < n && col < n){
                vals.add(grid[row++][col++]);
            }Collections.sort(vals);
            Collections.reverse(vals);
            map.put(idx, vals);
        }for(List<Integer> key: map.keySet()){
            List<Integer> vals = map.get(key);
            int row = key.get(0);
            int col = key.get(1);
            int index = 0;
            while(row < n && col < n){
                sol[row++][col++] = vals.get(index++);
            }
        }return sol;
    }
}