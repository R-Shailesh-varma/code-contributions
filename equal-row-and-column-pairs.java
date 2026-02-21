class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> rows = new HashMap<>();
        HashMap<String, Integer> cols = new HashMap<>();
        int n = grid.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.setLength(0);
            for(int j: grid[i]){
                sb.append(j);
                sb.append('-');
            }
            String s = sb.toString();
            rows.put(s, rows.getOrDefault(s, 0) + 1);
        }

        for(int i = 0; i < n; i++){
            sb.setLength(0);
            for(int j = 0; j < n; j++){
                sb.append(grid[j][i]);
                sb.append('-');
            }
            String s = sb.toString();
            cols.put(s, cols.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        for(String s: rows.keySet()){
            if(cols.containsKey(s)){
                count += rows.get(s) * cols.get(s);
            }
        }

        return count;
    }
}