class Solution {
    final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();
        for(int[] i: obstacles) obs.add(i[0]+","+i[1]);
        int x = 0, y = 0, d = 0;
        int ans = 0;
        for(int i: commands){
            if(i == -1){
                d = (d + 1) % 4;
            }else if(i == -2){
                d = (d + 3) % 4;
            }else{
                for(int j = 0; j < i; j++){
                    int nx = x + dirs[d][0];
                    int ny = y + dirs[d][1];
                    if(obs.contains(nx+","+ny)) break;
                    x = nx;
                    y = ny;
                    ans= Math.max(ans, (x*x + y*y));
                }
            }
        }return ans;
    }
}