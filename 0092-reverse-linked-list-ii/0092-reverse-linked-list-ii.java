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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        


         int count = 1;

         ListNode prev = null;
         ListNode curr = head;

         while(count < left) {
             
              prev = curr;
              curr = curr.next;

              count ++;
         }

         ListNode begin = prev;
         ListNode tail = curr;
        
        while(count <= right) {

            ListNode next = curr.next;

            curr.next = prev;
             prev = curr;
             curr = next;

             count ++;
        }

        if(begin == null) {
            head = prev;
        }
        else {
            begin.next = prev;
        }

        tail.next = curr;

        return head;

    }
}