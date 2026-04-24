class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, us = 0;
        for(char c: moves.toCharArray()){
            if(c == 'L') l++;
            else if(c == 'R') r++;
            else us++;
        }
        return us + Math.max(l, r) - Math.min(l, r);
    }
}