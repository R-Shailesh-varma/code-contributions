class Solution {
    public int heightChecker(int[] heights) {
        int max = 0;
        for(int i: heights){
            max = Math.max(max, i);
        }

        int freq[] = new int[max+1];
        for(int i: heights){
            freq[i]++;
        }
        int ans = 0;
        int index = 0;
        for(int i= 0; i < freq.length; i++){
            while(freq[i] > 0){
                if(heights[index++] != i){
                    ans++;
                }freq[i]--;
            }
        }

        return ans;

    }
}