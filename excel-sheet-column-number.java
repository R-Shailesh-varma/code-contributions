class Solution {
    public int titleToNumber(String columnTitle) {
        StringBuilder st = new StringBuilder(columnTitle);
        st.reverse();
        int num = 0;
        for(int i= 0; i < st.length(); i++){
            num += Math.pow(26,i)*(int)(st.charAt(i)-'A'+1);
        }return num;
    }
}