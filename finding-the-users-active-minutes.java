class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] ans = new int[k];
        for(int[] e: logs){
            map.computeIfAbsent(e[0], o -> new HashSet<Integer>()).add(e[1]);
        }
        for(int i: map.keySet()){
            ans[map.get(i).size()-1]++;
        }
        return ans;
    }
}