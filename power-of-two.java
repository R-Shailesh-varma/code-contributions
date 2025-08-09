class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        return (n & 1) == 0;
    }
}