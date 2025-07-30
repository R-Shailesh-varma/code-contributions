class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i < n; i++){
            res = countSay(res);
        }
        return res;
    }

    public String countSay(String s){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                sb.append(count);
                sb.append(s.charAt(i-1));
                count = 1;
            }
        }sb.append(count);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }   
}