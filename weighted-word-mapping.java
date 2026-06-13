class Solution {
    
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            sb.append(helper(s, weights));
        }
        return sb.toString();
    }

    private char helper(String s, int[] wt){
        int ans = 0;
        for(char c: s.toCharArray()){
            ans += wt[c - 'a'];
        }
        ans %= 26;
        return (char)('z' - ans);
    }

}