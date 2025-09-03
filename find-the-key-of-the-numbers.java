class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1 = convert(num1);
        String s2 = convert(num2);
        String s3 = convert(num3);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int min = Math.min(Math.min(s1.charAt(i) - '0', s2.charAt(i) - '0'), s3.charAt(i) - '0');
            sb.append(min);
        }
        return Integer.parseInt(sb.toString()); 
    }

    String convert(int num){
        return String.format("%04d", num);
    }
}
