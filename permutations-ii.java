class Solution {
    private Set<List<Integer>> sol;
    private int[] vals;
    private boolean[] visited;
    private void build(List<Integer> arr){
        visited = new boolean[vals.length];
        sol = new HashSet<>();
        helper(arr);
    }private void helper(List<Integer> arr){
        if(arr.size() == vals.length){
            sol.add(new ArrayList<>(arr));
            return;
        }for(int i = 0; i < vals.length; i++){
            if(!visited[i]){
                visited[i] = true;
                arr.add(vals[i]);
                helper(arr);
                arr.remove(arr.size()-1);
                visited[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        vals = nums;
        build(new ArrayList<>());
        List<List<Integer>> solArr = new ArrayList(sol);
        solArr.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return solArr;
    }
}