;/**
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
    public void reorderList(ListNode head) {
        
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

       ListNode second = s.next;// this part very important 
       s.next = null;
    

    ListNode prev = null;
    ListNode curr = second;

    while(curr != null) {

         ListNode next = curr.next;

         curr.next = prev;
         prev = curr;
         curr = next;
    }

    ListNode l1 = head;;
    ListNode l2 = prev;

 
  

    while(l1 != null && l2 != null) {
             
        ListNode n1 = l1.next;
        ListNode n2 = l2.next;

        l1.next = l2;
        l2.next = n1;

        l1 = n1;
        l2 = n2;

  }
}
}