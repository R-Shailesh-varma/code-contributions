class Solution {
    public int minimumArea(int[][] grid) {
        int minR = grid.length, maxR = 0;
        int minC = grid[0].length, maxC = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }return (maxR - minR + 1)* (maxC - minC + 1);
    }
}