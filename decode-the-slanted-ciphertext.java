class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n % rows == 0 ? n / rows : n/rows + 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cols; i++){
            int j = i;
            while(j < cols*rows){
                sb.append(j < n ? encodedText.charAt(j) : " ");
                j += cols + 1;
            }
        }
        String trimmed = sb.toString().replaceAll("\\s+$", "");
        return trimmed;
    }
}