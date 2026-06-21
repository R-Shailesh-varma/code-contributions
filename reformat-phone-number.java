class Solution {
    public String reformatNumber(String number) {
        String nums = number.replace("-","").replace(" ", "");
        int len = nums.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(len - i > 4){
            sb.append(nums.substring(i, i+3));
            sb.append("-");            
            i += 3;
        }

        if(len - i == 4){
            sb.append(nums.substring(i, i+2));
            sb.append("-");
            sb.append(nums.substring(i+2));
        }else{
            sb.append(nums.substring(i));
        }

        return sb.toString();
    }
}