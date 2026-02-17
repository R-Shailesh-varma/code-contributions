class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> sol = new ArrayList<>();
        helper(1, k, n, 0, sol, new ArrayList<>());
        return sol;
    }
    
    private void helper(int i, int k, int n, int sum, List<List<Integer>> sol, List<Integer> cur){
        if(cur.size() == k){
            if(sum == n) sol.add(new ArrayList<>(cur));
            return;
        }

        for(; i <= 9; i++){
            cur.add(i);
            sum += i;
            helper(i+1, k, n, sum, sol, cur);
            sum -= i;
            cur.remove(cur.size()-1);
        }
    }
}