class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s.length() < 4) return new ArrayList<>();
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(s, arr, sb, 0, 0);
        return arr;
    }public void helper(String s, List<String> arr, StringBuilder sb, int dots, int srt){
        if(dots == 3){
            String parts = s.substring(srt);
            if(!isValid(parts)) return;
            sb.append(parts);
            arr.add(sb.toString());
        }
        int len = sb.length();
        for(int i = 1; i < 4; i++){
            if(srt+i < s.length()){
                String sub = s.substring(srt, srt+i);
                if(!isValid(sub)) continue;
                sb.append(sub).append('.');
                helper(s, arr, sb, dots+1, srt+i);
                sb.delete(len, sb.length());
            }
        }
    }public boolean isValid(String s){
        if(s.length() > 3) return false;
        if(s.length() > 1 && s.charAt(0) == '0') return false;
        int val = Integer.parseInt(s);
        if(val < 0 || val > 255) return false;
        return true;
    }
}