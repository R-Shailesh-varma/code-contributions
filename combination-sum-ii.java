class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, 0, target, new ArrayList<>());
        return ans;
    }void solve(int[] candidates, int srt, int target, List<Integer> cur){
        if(target == 0){
            ans.add(new ArrayList<>(cur));
            return;
        }   
        for(int i = srt; i < candidates.length; i++){
            if(i > srt && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            cur.add(candidates[i]);
            solve(candidates, i+1, target - candidates[i], cur);
            cur.remove(cur.size() - 1);
        }
    }
}