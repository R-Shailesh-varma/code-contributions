class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
           if(isVowel(s.charAt(i))) count++;
           if(i >= k){
                if(isVowel(s.charAt(i-k))) count--;
           }
            ans = Math.max(ans, count);
        }return ans;
    }private boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') return true;
        return false;
    }
}