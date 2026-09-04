class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    
         Arrays.sort(nums1);
         Arrays.sort(nums2);

      ArrayList<Integer> list = new ArrayList<>();

      boolean continuous = false;

      for(int i = 0; i < nums2.length; i ++) {

        if(!(list.contains(nums2[i])) && bs(nums1, nums2[i])) {

            list.add(nums2[i]);
        }
      }

      int[] brr = new int[list.size()];

      for(int i = 0; i < list.size(); i ++) {
        brr[i] = list.get(i);
      }

      return brr;
   
    }

    public boolean bs(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return true;
            }
           else if(arr[mid] > target){
                end = mid - 1;
           }
           else {
                start = mid + 1;
           }

        }
        return false;
    }
}