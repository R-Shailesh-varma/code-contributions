class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combinations(1, n, k, cur);
        ans.sort((a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });
        return ans;
    }void combinations(int srt, int n, int k, List<Integer> cur){
        if(cur.size() == k){
            ans.add(new ArrayList<>(cur));
            return;
        }for(int i = srt; i <= n - (k - cur.size()) + 1; i++){
            cur.add(i);
            combinations(i+1, n, k, cur);
            cur.remove(cur.size()-1);
        }return;
    }
}