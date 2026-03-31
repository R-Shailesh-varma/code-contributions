class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> lis = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            helper(i, n-1, k, lis);
        }

        int[] ans = new int[lis.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = lis.get(i);
        }
        return ans;
    }

    static void helper(int num, int n, int k, List<Integer> lis){
        if(n == 0){
            lis.add(num);
            return;
        }

        int last = num % 10;
        int left = last - k;
        int right = last + k;
        if(left >= 0){
            helper(num*10+left, n-1, k, lis);
        }
        if(right <= 9 && left != right){
            helper( num*10+right, n-1, k, lis);
        }
    }

}