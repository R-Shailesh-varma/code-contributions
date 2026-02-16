class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Map<String, Integer> dp = new HashMap<>();
        return helper(triangle, 0, 0, dp);
    }public int helper(List<List<Integer>> tri, int row, int col, Map<String, Integer> map){
        if(row >= tri.size()) return 0;
        String cur = row+"-"+col; 
        if(map.containsKey(cur)) return map.get(cur);
        int left = helper(tri, row+1, col, map);
        int right = helper(tri, row+1, col+1, map);
        int min = tri.get(row).get(col) + Math.min(left, right);
        map.put(cur, min);
        return map.get(cur);
    }
}