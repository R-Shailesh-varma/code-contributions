class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        if(n == 0) return cells;
        n = n%14;
        if(n == 0) n = 14;
        for(int i = 0; i < n; i++){
            int[] cur = cells.clone();
            cur[0] = 0;
            cur[7] = 0;
            for(int j = 1; j < 7; j++){
                if((cells[j+1] ^ cells[j-1]) == 0){
                    cur[j] = 1;
                }else{
                    cur[j] = 0;
                }
            }
            cells = cur;
        }return cells;
    }
}