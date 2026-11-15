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
        public boolean isPalindrome(ListNode head) {

                if (head == null || head.next == null) {
                            return true;
                                    }

                                            int val = mid(head);

                                                    ListNode left;
                                                            ListNode right;

                                                                    if (val % 2 == 0) {
                                                                                left = node(head, val / 2);
                                                                                            right = node(head, (val / 2) + 1);
                                                                                                    } else {
                                                                                                                left = node(head, val / 2);
                                                                                                                            right = node(head, (val / 2) + 2);
                                                                                                                                    }

                                                                                                                                            left.next = null;

                                                                                                                                                    ListNode prev = null;
                                                                                                                                                            ListNode curr = right;

                                                                                                                                                                    // Reverse the second half
                                                                                                                                                                            while (curr != null) {

                                                                                                                                                                                        ListNode next = curr.next;

                                                                                                                                                                                                    curr.next = prev;

                                                                                                                                                                                                                prev = curr;
                                                                                                                                                                                                                            curr = next;
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                            ListNode begin = prev;
                                                                                                                                                                                                                                                    ListNode c = head;

                                                                                                                                                                                                                                                            // Compare both halves
                                                                                                                                                                                                                                                                    while (begin != null && c != null) {

                                                                                                                                                                                                                                                                                if (begin.val != c.val) {
                                                                                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                        begin = begin.next;
                                                                                                                                                                                                                                                                                                                                    c = c.next;
                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                            public int mid(ListNode head) {

                                                                                                                                                                                                                                                                                                                                                                    int count = 0;
                                                                                                                                                                                                                                                                                                                                                                            ListNode curr = head;

                                                                                                                                                                                                                                                                                                                                                                                    while (curr != null) {
                                                                                                                                                                                                                                                                                                                                                                                                count++;
                                                                                                                                                                                                                                                                                                                                                                                                            curr = curr.next;
                                                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                                                            return count;
                                                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                                                    public ListNode node(ListNode head, int count) {

                                                                                                                                                                                                                                                                                                                                                                                                                                            int num = 1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    ListNode curr = head;

                                                                                                                                                                                                                                                                                                                                                                                                                                                            while (num < count) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        curr = curr.next;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    num++;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return curr;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
}