class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for(int i: arr1){
            max = Math.max(i, max);
        }

        int freq[] = new int[max+1];
        for(int i: arr1){
            freq[i]++;
        }
        int index = 0;
        for(int i: arr2){
            while(freq[i] > 0){
                freq[i]--;
                arr1[index++] = i;
            }
        }
        
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                freq[i]--;
                arr1[index++] = i;
            }
        }

        return arr1;

    }
}