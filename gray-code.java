class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> vis = new HashSet<>();
        res.add(0);
        vis.add(0);
        grayCodeHelper(res, vis, 0, n);
        return res;
    }boolean grayCodeHelper(List<Integer> res, Set<Integer> vis, int curr, int n){
        if(res.size() == 1<<n){
            return true;
        }
        for(int i = 0; i < n; i++){
            int next = curr ^ (1 << i);
            if(!vis.contains(next)){
                res.add(next);
                vis.add(next);
                if(grayCodeHelper(res, vis, next, n)){
                    return true;
                }res.remove(res.size() - 1);
                vis.remove(next);
            }
        }
        return false;
    }
}