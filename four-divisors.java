class Solution {
    public int sumFourDivisors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i: nums){
            if(map.keySet().contains(i)){
                sum += map.get(i);
                continue;
            }
            map.put(i, onlyFour(i));
            sum += map.get(i);
        }return sum;
    }private int onlyFour(int num){
        int k = 0;
        int sum = 0;
        for(int i = 1; i*i <= num; i++){
            if(num%i == 0){
                int d1 = i;
                int d2 = num/i;
                if(d1 == d2){
                    k++;
                    sum += d1;
                }else{
                    k += 2;
                    sum += d1+d2;
                }
            }
        }return k == 4 ? sum : 0; 
    }
}