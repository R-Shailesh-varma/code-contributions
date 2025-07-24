class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char i : s.toCharArray()){
            freq[i-'a']++;
        }
        int ans = -1;
        int index = 0;
        for(char i: s.toCharArray()){
            if(freq[i-'a'] == 1){
                ans = index;
                break;
            }else{
                index++;
            }
        }
        return ans;
    }
}