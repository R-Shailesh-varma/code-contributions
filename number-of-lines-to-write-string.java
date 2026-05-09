class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int n = s.length(), i = 0;
        int lines = 0;
        int cur = 0;
        while(i < n){
            cur = 0;
            while(i < n && (cur + widths[s.charAt(i)-'a']) <= 100){
                cur += widths[s.charAt(i)-'a'];
                i++;
            }
            lines++;
        }
        return new int[]{lines, cur};
    }
}