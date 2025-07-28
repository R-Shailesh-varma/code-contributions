class Solution {
    public boolean isUgly(int n) {
        if (n == 0){
            return false;
        }
        return uglyNum(n);
    }public boolean uglyNum(int n){
        if(n == 1 || n == 0){
            return true;
        }
        boolean returnVal = false;
        if(n%2 == 0 ){
            returnVal = uglyNum(n/2);
        }else if(n%3 == 0 ){
            returnVal = uglyNum(n/3);
        }else if(n%5 == 0 ){
            returnVal = uglyNum(n/5);
        }
        return returnVal || false;
        
    }
}