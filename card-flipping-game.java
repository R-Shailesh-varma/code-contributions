class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int n = fronts.length;
        int ans = Integer.MAX_VALUE;
        Set<Integer> bad = new HashSet<>();
        Set<Integer> all = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(fronts[i] == backs[i]){
                bad.add(fronts[i]);
            }else{
                all.add(fronts[i]);
                all.add(backs[i]);
            }
        }

        for(int i: all){
            if(!bad.contains(i)) ans = Math.min(ans, i);
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}