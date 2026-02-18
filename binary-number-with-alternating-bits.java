class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while(n > 0){
            int cur = n & 1;
            if(prev == cur) return false;
            prev = cur;
            n = (n >> 1);
        }return true;
    }
}