class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
            arr[i] += arr[i-1];
        }
        
        for(int i = 3; i <= arr.length; i += 2){
            sum += arr[i-1];
            for(int j = i; j < arr.length; j++){
                sum += (arr[j] - arr[j - i]);
            }
        }

        return sum;

    }
}