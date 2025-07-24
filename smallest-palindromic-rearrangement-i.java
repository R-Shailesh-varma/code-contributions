class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1 || s.length() == 2) return s;
        int n = s.length();
        String HalfArr = countingSort(s.substring(0, n/2));
        StringBuilder rev = new StringBuilder(HalfArr);
        if( n%2 != 0){
            HalfArr += s.charAt(n/2);
        }
        HalfArr += rev.reverse().toString();
        return HalfArr;
    }

    public static String countingSort(String s){
        // char[] charArr = s.toCharArray();
        int[] countArr = new int[26];
        for(char i: s.toCharArray()){
            countArr[i-'a']++;
        }
        // int index = 0;
        String res = "";
        for(int i = 0; i < 26; i++){
            while(countArr[i]>0){
                res += (char)(i+'a');
                countArr[i]--;
            }
        }
        return res;
    }

}