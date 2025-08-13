class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        return isPow(n, 3);
    }public boolean isPow(int n, int p){
        if(n == 0 || n == 1){
            return true;
        }if(n % p != 0){
            return false;
        }return isPow(n/p, p);
    }
}