class Solution {
    Set<List<Integer>> set = new HashSet<>();
    List<List<Integer>> ans = new ArrayList<>(); 
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, 0, new ArrayList<>());
        ans.add(new ArrayList<>());
        return ans;
    }public void solve(int[] nums, int srt, List<Integer> cur){
        if(srt >= nums.length && !set.contains(cur)){
            // ans.add(new ArrayList<>(cur));
            // set.add(new ArrayList<>(cur));
            return;
        }
        for(int i = srt; i < nums.length; i++){
            cur.add(nums[i]);
            solve(nums, i+1, cur);
            ans.add(new ArrayList<>(cur));
            set.add(new ArrayList<>(cur));
            cur.remove(cur.size() - 1);
        }
    }
}