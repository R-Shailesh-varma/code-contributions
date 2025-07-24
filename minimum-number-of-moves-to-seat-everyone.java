class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        seats = countingSort(seats);
        students = countingSort(students);
        int res = 0;
        for(int i = 0; i < seats.length; i++){
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }
    public static int[] countingSort(int[] arr){
        int max = 0;
        for(int i : arr){
            max = Math.max(i, max);
        }
        int countArr[] = new int[max+1];
        for(int i: arr){
            countArr[i]++;
        }
        int index = 0;
        for(int i = 0; i < countArr.length; i++){
            while(countArr[i] > 0){
                arr[index++] = i;
                countArr[i]--;
            }
        }
        return arr;
    }
}