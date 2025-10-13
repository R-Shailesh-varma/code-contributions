class Solution {
    void build(List<String> s, StringBuilder sb, int open, int close, int n){
        if(sb.length() == 2*n){
            s.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append("(");
            build(s, sb, open+1 , close, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            sb.append(")");
            build(s, sb, open , close+1, n);
            sb.deleteCharAt(sb.length()-1);
        }return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> paran = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        build(paran, sb, 0, 0, n);
        return paran;
    }
}