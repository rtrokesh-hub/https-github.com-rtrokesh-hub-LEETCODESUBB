class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
 

 List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i ++) {
             int index = bs(nums1, nums2[i]);
            if(index  != -1) {
                list.add(nums2[i]);
                nums1[index] = -1;
                   Arrays.sort(nums1);
 
            }
        }

        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            ans[i] = list.get(i);
        }
     
     return ans;
    }

    public int bs(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;


        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
    
}