class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while(sb.length() <= k ){
            int n = sb.length();
            for(int i = 0; i < n; i++){
                if(sb.charAt(i) == 'z'){
                    sb.append("a");
                    continue;
                }
                sb.append((char) (sb.charAt(i) +1));
            }
        }return sb.charAt(k-1);
    }
}
