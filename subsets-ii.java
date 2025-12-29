class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        helper(nums, res, set, 0, new ArrayList<>());
        // res.add(new ArrayList<>());
        return res;
    }public void helper(int[] nums, List<List<Integer>> res, Set<List<Integer>> set, int srt, List<Integer> cur){
        // if(srt >= nums.length) return;
        if(!set.contains(cur)){
            res.add(new ArrayList<>(cur));
            set.add(new ArrayList<>(cur));
        }
        for(int i = srt; i < nums.length; i++){
            cur.add(nums[i]);
            helper(nums, res, set, i+1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}