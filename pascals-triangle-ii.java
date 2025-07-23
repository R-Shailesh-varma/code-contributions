class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> rows = new ArrayList<>();
            if(i == 0){
                rows.add(1);
            }else if(i == 1){
                rows.add(1);
                rows.add(1);
            }else{
                rows.add(1);
                // List<Integer> prev = res.get(i-1);
                for(int j = 1; j < i; j++){
                    rows.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }rows.add(1);
            }res.add(rows);
        }
        return res.get(rowIndex);
    }
}