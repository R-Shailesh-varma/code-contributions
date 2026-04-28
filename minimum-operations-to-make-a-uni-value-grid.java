class Solution {
    public int minOperations(int[][] grid, int x) {
        
        List<Integer> vals = new ArrayList<>();
        int rem = grid[0][0] % x;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] % x != rem) return -1;
                vals.add(grid[i][j]);
            }
        }

        Collections.sort(vals);
        int n = vals.size();

        int y = vals.get(n/2);
        return find(x, y, vals);
    }
    private int find(int x, int y, List<Integer> vals){
        int count = 0;
        for(int i = 0; i < vals.size(); i++){
            count += (Math.abs(vals.get(i) - y) / x);
        }
        return count;
    }
}