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
    public ListNode rotateRight(ListNode head, int k) {

        int count = len(head);

        if(head  == null || head.next == null || k == 0) {
            return head;
        }

        k = k % count;

        if(k == 0) {
            return head;
        }

        int pos = count - k;
        ListNode curr = head;

        while(pos != 1) {
            curr = curr.next;
            pos -- ;
        }

        ListNode temp = curr.next; 
        curr.next = null;
        ListNode first = temp;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        head = first;

        return head;


    }

    public int len(ListNode head) {

         int count = 0;

         ListNode curr = head;

         while(curr != null) {
            curr = curr.next;
            count ++;
         }

         return count;

   }
}