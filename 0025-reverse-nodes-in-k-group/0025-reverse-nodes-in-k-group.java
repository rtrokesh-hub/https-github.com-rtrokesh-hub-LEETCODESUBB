/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    
    
      ListNode dummy = new ListNode(0, head);

      ListNode grpprev = dummy;
      ListNode kth = dummy;

      while(true) {

          kth = grpprev;

           for(int i = 0; kth != null && i < k; i ++) {
              kth = kth.next;
           }

           if(kth == null) {
            break;
           }

           ListNode prev = kth.next;
           ListNode curr = grpprev.next;
           int count = 0;

           while(count < k) {
               
               ListNode next = curr.next;

               curr.next = prev;
               prev = curr;
               curr = next;

               count ++;
           }

           ListNode temp = grpprev.next;
           grpprev.next = prev;
           grpprev = temp;

          

      }

      return dummy.next;
     
    }
}