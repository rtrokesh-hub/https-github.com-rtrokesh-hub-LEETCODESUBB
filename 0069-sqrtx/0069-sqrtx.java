class Solution {
    public int mySqrt(int x) {
        

        return bs(x);
    }
    public int bs(int x) {

        int left = 0;
        int right = x;
 
        while(left <= right) {

            int mid = left + (right - left) / 2;
                 
            long var = (long)mid * mid;

            if(var > x) {

                right = mid - 1;
            }
            else if(var < x) {

                left = mid + 1;
            }

            else {
                return mid;
            }
        
            
        }

        return right;
    }
}