class Solution {
    public int myAtoi(String s) {
        if(s == null || s.isEmpty()) return 0;
        s = s.trim();
        int i = 0, sign = 1, res = 0;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(res > (Integer.MAX_VALUE - digit)/ 10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10 + digit;
            i++;
        }
        return res*sign;
    }
}