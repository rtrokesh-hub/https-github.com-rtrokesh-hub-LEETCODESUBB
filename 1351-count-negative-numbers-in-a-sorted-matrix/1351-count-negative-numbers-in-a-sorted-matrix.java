class Solution {
    public int countNegatives(int[][] grid) {
        

              int count = 0;
        for(int[] arr : grid) {
            int ans = bs(arr);
            count += (arr.length - 1 - ans);

        }
        return count;
    }

    public int bs(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start  + (end - start) / 2;

            if(arr[mid] <=  -1) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end;

    }
}