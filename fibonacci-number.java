class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int prev = 0;
        int cur = 1;
        for(int i = 0; i < n; i++){
            int nu = prev + cur;
            prev = cur;
            cur = nu;
        }return prev;
    }
}