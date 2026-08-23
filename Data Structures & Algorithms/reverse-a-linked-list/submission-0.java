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
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        ListNode current = head;

        while (current != null){
            ListNode nextt = current.next;
            current.next = first;
            first = current;
            current = nextt;
            
        }
        return first;
    }
}