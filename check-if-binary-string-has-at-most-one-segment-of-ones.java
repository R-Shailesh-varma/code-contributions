class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        int idx = 0;
        while(idx < s.length() && s.charAt(idx) == '1') idx++;
        for(int i = idx; i < s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        return count == 0;
    }
}