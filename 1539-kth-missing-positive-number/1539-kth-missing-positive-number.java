class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
      for(int i = 1; i <= 100000; i ++) {
        if(bs(arr, i)) {
             continue;
        }
        else {
            list.add(i);
        }
      }

      if(k > list.size()) {
        return -1;
      }
      else {

      if(k != 0) {
        return list.get(k - 1);
      }
      else {
        return list.get(k);
      }
    }
    }

    public boolean bs(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return true;
            }

            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}