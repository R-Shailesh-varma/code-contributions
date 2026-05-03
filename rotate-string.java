class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i < sb.length()){
            if(sb.toString().equals(goal)) return true;
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            i++;
        }
        return false;
    }
}