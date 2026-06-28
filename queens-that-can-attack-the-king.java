class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] qs = new boolean[8][8];
        for(int[] i: queens){
            qs[i[0]][i[1]] = true;
        }
        List<List<Integer>> ans = new ArrayList<>();

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        for(int i = 0; i < 8; i++){
            int dx = king[0];
            int dy = king[1];
            int[] c = dirs[i];
            while(dx >= 0 && dy >= 0 && dx < 8 && dy < 8){
                if(qs[dx][dy]){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(dx);
                    cur.add(dy);
                    ans.add(cur);
                    break;
                }
                dx += c[0];
                dy += c[1];
            }
        }

        return ans;

    }
}