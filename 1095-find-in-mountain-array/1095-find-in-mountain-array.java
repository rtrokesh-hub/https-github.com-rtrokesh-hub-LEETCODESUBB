/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
         int max = bs(mountainArr);

        int ans1 = bs1(mountainArr, target, 0, max);
        int ans2 = bs2(mountainArr, target, max + 1, mountainArr.length() - 1);

        if(ans1 == -1 && ans2 == -1) {
            return -1;
        }
        if(ans1 == -1) {
            return ans2;
        }
        if(ans2 == -1) {
            return ans1;
        }

        return (ans1 < ans2) ? ans1 : ans2;
    }

    public int bs(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

        

             if(arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;

    }

    public int bs1(MountainArray arr, int target, int start, int end) {

        
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr.get(mid) == target) {
                return mid;
            }
            else if(arr.get(mid) < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
        
        }

        public int bs2(MountainArray arr, int target, int start, int end) {

            while(start <= end) {

                int mid = start + (end - start) / 2;

                if(arr.get(mid) == target) {
                    return mid;
                }

                else if(arr.get(mid) < target){
                      end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }