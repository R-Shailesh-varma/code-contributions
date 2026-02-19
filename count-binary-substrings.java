class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                int j = i-1;
                int jc = 1;
                int ic = 1;
                while(j > 0 && s.charAt(j) == s.charAt(j-1)){
                    j--;
                    jc++;
                }while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                    i++;
                    ic++;
                }ans += Math.min(ic, jc);
            }
        }return ans;
    }
}