class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->{
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        int pointer = 0;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[pointer][1] >= intervals[i][0]){
                intervals[pointer][1] = Math.max(intervals[i][1], intervals[pointer][1]);
            }else{
                pointer++;
                intervals[pointer][0] = intervals[i][0];
                intervals[pointer][1] = intervals[i][1];
            }
        }pointer++;
        return Arrays.copyOfRange(intervals, 0, pointer);
    }
}