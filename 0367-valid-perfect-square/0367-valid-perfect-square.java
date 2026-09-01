class Solution {
    public boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num - 1;

        if(num == 1) {
            return true;
        }

        while(start <= end) {

            int mid = start + (end - start) / 2;

            long pow = (long)mid * mid;

            if(pow == num) {
                return true;
            }
            else if(pow > num) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
        
    }

   
}