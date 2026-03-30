class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] odds = new int[26];
        int[] eves = new int[26];
        for(int i = 0; i < s1.length(); i++){
            if(i%2 == 0){
                eves[s1.charAt(i)-'a']++;
                eves[s2.charAt(i)-'a']--;
            }else{
                odds[s1.charAt(i)-'a']++;
                odds[s2.charAt(i)-'a']--;
            }
        }
        for(int i = 0; i < 26; i++){
            if(odds[i] > 0 || eves[i] > 0) return false;
        }

        return true;
    }
}