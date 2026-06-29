class Solution {
    public int largestInteger(int num) {

        String ipt = String.valueOf(num);        
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        
        for(char c: ipt.toCharArray()){
            int i = c - '0';
            if(i % 2 == 0) even.add(i);
            else odd.add(i);
        }

        odd.sort(Collections.reverseOrder());
        even.sort(Collections.reverseOrder());

        int oi = 0, ei = 0;
        int ans = 0;
        for(char c: ipt.toCharArray()){
            int i = c - '0';
            if(i%2 == 0){
                ans = ans*10 + even.get(ei++);
            }else{
                ans = ans*10 + odd.get(oi++);
            }
        }

        return ans;

   }
}