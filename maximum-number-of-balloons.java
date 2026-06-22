class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alphas = new int[26];
        for(char c: text.toCharArray()){
            alphas[c-'a']++;
        }

        int[][] occ = {{1, 1}, {0, 1}, {14, 2}, {11, 2}, {13, 1}};
        int ans = Integer.MAX_VALUE;
        for(int[] i: occ){
            int cur = alphas[i[0]]/i[1];
            ans = Math.min(ans,cur);
        }

        return ans;
    }
}