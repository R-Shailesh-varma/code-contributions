class Solution {
    public int hIndex(int[] citations) {
        int papers = citations.length;
        int[] totalCitations = new int[papers + 1];
        for(int i : citations){
            totalCitations[Math.min(i,papers)]++;
        }
        int cumSum = 0;
        for(int i = totalCitations.length-1; i >= 0; i--){
            cumSum += totalCitations[i];
            if(cumSum >= i){
                return i;
            }
        }return 0;
    }
}