class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        return helper(s, set, 0, 0);
    }

    int helper(String s, Set<String> set, int i, int ans){
        if(i == s.length()) return Math.max(ans, set.size());
        for(int idx = i+1; idx <= s.length(); idx++){
            String cur = s.substring(i, idx);
            if(!set.contains(cur)){
                set.add(cur);
                ans = Math.max(ans, helper(s, set, idx, ans));
                set.remove(cur);
            }
        }
        return ans;
    }
}