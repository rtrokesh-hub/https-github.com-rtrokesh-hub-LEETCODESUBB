class Solution {
    public int distributeCookies(int[] cookies, int k) {

        int left = 0;
        int right = 0;

        for(int n : cookies) {
            left = Math.max(left, n);
            right += n;
        }


        while(left < right) {

            int mid = left + (right - left) / 2;
        int[] number = new int[k];

            if(backtracking(cookies, 0, number, mid)) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
        
    }

    public boolean backtracking(int[] arr, int index, int[] number, int limit) {

        if(index == arr.length) {
            return true;
        }

         int cookies = arr[index];
        for(int i = 0; i < number.length; i ++) {
                
                if(number[i] + cookies <= limit) {
                     
                     number[i] += cookies;

                    if(backtracking(arr, index + 1, number, limit)) {
                        return true;
                     }
                     number[i] -= cookies;
                }
        }
        return false;
    }

}