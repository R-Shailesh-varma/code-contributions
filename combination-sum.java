class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, target, 0, new ArrayList<>(), 0);
        return ans;
    }void solve(int[] candidates, int target, int srt, List<Integer> cur, int curSum){
        if(curSum > target){
            return;
        }if(curSum == target){
            ans.add(new ArrayList<>(cur));
        }for(int i = srt; i < candidates.length; i++){
            curSum += candidates[i];
            cur.add(candidates[i]);
            solve(candidates, target, i, cur, curSum);
            cur.remove(cur.size() - 1);
            curSum -= candidates[i];
        }
    }
}