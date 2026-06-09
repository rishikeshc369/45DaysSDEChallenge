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
        
        ListNode prv = null;
        ListNode tmp = head;
        while(tmp != null){
            ListNode front = tmp.next;
            tmp.next = prv;
            prv = tmp;
            tmp = front;
        }
        return prv;
    }
}