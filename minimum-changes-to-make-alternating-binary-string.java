class Solution {
    public int minOperations(String s) {
        if(s.length() == 0) return 0;
        
        int prev0 = 1;
        int count0 = 0;
        
        int prev1 = 0;
        int count1 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)-'0' == prev1) count1++;
            prev1 ^= 1;
            if(s.charAt(i)-'0' == prev0) count0++;
            prev0 ^= 1;
        }
        return Math.min(count0, count1);
    }
}