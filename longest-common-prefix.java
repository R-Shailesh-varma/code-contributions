class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String pre = strs[0];
        int len = pre.length();
        for(int i = 0; i < strs.length ; i++){
            String st = strs[i];
            while(len > st.length() || !pre.equals(st.substring(0, len))){
                len--;
                if(len == 0){
                    return "";
                }pre = pre.substring(0, len);
            }
        }return pre;
    }
}