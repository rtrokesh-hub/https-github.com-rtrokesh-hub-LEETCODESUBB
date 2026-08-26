class Solution {
    public int search(int[] nums, int target) {
        

        int max = pivot(nums);
 
        if(target >= nums[0]) {
            return bs(nums, target, 0, max);
        }
        else {
            return bs(nums, target, max + 1, nums.length - 1);
        }

      
    }

   public int pivot(int[] nums) {

      int start = 0;
      int end = nums.length - 1;

    
    while(start < end) {

        int mid = start + (end - start) / 2;

        if(mid < end && nums[mid] > nums[mid + 1]) {
            return mid;
        }
       

     if(nums[start] > nums[mid]) {
            end = mid - 1;
        }
        else {
        start = mid + 1;
        }

    }
    return start;
  
   }
   public int bs(int[] nums, int target, int start, int end) {

         while(start <= end) {

           int mid = start + (end - start) / 2;

           if(nums[mid] == target) {
            return mid;
           }

           else if(nums[mid] < target) {
             start = mid + 1;
           }
           else {
             end = mid - 1;
           }
         }
         return -1;
      
   }


  
}