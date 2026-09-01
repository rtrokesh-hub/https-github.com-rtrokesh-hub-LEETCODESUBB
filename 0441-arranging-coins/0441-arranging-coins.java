class Solution {
    public int arrangeCoins(int n) {
        

        int start = 1;
        int end = n;

        while(start <= end) {

            long mid = start + (end - start) / 2;

            long coins = (mid * (mid + 1)) / 2;

            if(coins == n) {
                return (int)mid;
            }
            else if(coins > n){
                 end = (int)mid - 1;
            }
            else {
                start = (int)mid + 1;
            }
        }
        return end;
    }
}