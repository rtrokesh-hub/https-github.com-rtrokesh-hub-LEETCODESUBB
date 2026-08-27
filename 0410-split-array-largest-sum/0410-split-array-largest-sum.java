class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left = 0; 
        int right = 0;
 
        for(int n : nums) {
            left = Math.max(left, n);
            right += n ;
        }

        while(left < right) {

            int mid  = left + (right - left) / 2;

            int piece = 1;
            int sum = 0;

             for(int n : nums) {
                if(n + sum > mid) {
                     piece ++;
                     sum = n;
                }
                else {
                    sum += n;
                }
             }

             if(piece > k) {
                 left = mid + 1;
             }
             else {
                right = mid;
             }
        }

        return left;
    }
}
