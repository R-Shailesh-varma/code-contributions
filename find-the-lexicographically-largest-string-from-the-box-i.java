class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;

        String ans = "@";
        int n = word.length();
        int size = n - numFriends + 1;

        for (int i = 0; i < n; i++){
            char c = word.charAt(i);
            int remLen = Math.min(n-i, size);
            if(c >= ans.charAt(0)){
                String cur = word.substring(i, i+remLen);
                if(cur.compareTo(ans) > 0) ans = cur;
            }
        }

        return ans;

    }
}