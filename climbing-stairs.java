class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int prev = 1;
        int cur = 2;
        for(int i = 1; i < n; i++){
            int nu = prev + cur;
            prev = cur;
            cur = nu;
        }return prev;
    }
}