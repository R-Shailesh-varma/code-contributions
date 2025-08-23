class Solution {
    private int[] vals;
    private List<List<Integer>> sol = new ArrayList<>();
    private boolean[] visited;
    private void build(List<Integer> arr){
        visited = new boolean[vals.length];
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
                arr.remove(arr.size() - 1);
                visited[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        vals = nums;
        build(new ArrayList<>());
        return sol;
    }
}