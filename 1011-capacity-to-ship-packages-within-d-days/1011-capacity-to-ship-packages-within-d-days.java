class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left = 0;
        int right = 0;

        for(int n : weights) {

            left = Math.max(left, n);
            right += n;
        }

        while(left < right) {

            int mid = left + (right - left) / 2;

            int day = 1;
            int sum = 0;

            for(int i : weights) {

                if(i + sum > mid) {
                    day ++;
                    sum = i;
                }
                else {
                     sum += i;
                }
            }

            if(day <= days) {
                right = mid;
            }
            else {
                left = mid + 1;
            }

        }
        return left;


    }
}