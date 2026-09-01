class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans = new int[2];
  
       for(int i = 0; i < numbers.length; i ++) {
          int sum = target - numbers[i];

          int a = find(numbers, sum, i);

          

         
          if(a != -1) {

        
            ans[0] = i + 1;
            ans[1] = a + 1;
            break;
          
          }
        }


          

       

       return ans;
    }

  public int find(int[] arr, int target, int index) {

    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {

        int mid = start + (end - start) / 2;

        if(mid == index) {
            start = mid + 1;
        }
        else {

        if(arr[mid] > target) {
            end = mid - 1;
            
        }
        else if(arr[mid] < target){
                 start = mid + 1;
        }
        else {
            return mid;
        }
        }
    }

    return -1;
  }
      
    }
