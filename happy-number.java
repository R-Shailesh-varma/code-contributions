class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(!s.contains(n)){
            s.add(n);
            n = NextNum(n);
            if(n == 1){
                return true;
            }
        }return false;
    }private int NextNum(int n){
        int sum = 0;
        while(n > 0){
            int d = n%10;
            sum += d*d;
            n = n/10;
        }
        return sum;
    }
}