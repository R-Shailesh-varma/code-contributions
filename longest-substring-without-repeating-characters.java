class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        // int currCount = 0;
        HashSet<Character> hs = new HashSet<>();
        int left= 0;
        int right = 0;
        while(right < s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                right++;
                maxCount = Math.max(maxCount, right-left);
            }else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxCount;
    }
}