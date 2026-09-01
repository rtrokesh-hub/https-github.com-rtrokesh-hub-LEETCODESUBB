class Solution {
    public int arrangeCoins(int n) {
        
        int count = 0;

        int sum = n;

        for(int i = 1; i <= n; i ++) {

             sum -= i;

            if(sum >= 0) {
                count ++;
            }
            else {
                break;
            }
        }

        return count;

    }
}