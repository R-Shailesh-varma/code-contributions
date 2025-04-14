class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int cg = 0; 
        if(sum(gas) < sum(cost)){
            return -1;
        }for(int i = 0; i< gas.length; i++){
            cg += gas[i] - cost[i];
            if(cg < 0){
                cg = 0;
                start = i + 1;
            }
        }return start;
    }
    int sum(int[] arr){
        int k = 0;
        for(int i = 0; i< arr.length; i++){
            k+= arr[i];
        }
        return k;
    }
}