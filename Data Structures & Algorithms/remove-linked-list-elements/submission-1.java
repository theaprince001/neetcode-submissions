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
    public ListNode removeElements(ListNode head, int val) {
        // ListNode dummy = new ListNode(0);
        ListNode N= head;
        if(N == null)  return N;

        if(N.val == val){
            return removeElements(N.next,val);
        }
        else{
            N.next = removeElements(N.next,val);
            return N;
        }
    }
}