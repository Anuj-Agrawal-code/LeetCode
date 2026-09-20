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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode current = head;

        int length = 0; 

        while(p != null)
        {
            p = p.next;
            length++;
        }

        if(n == length)
            return head.next;

        for(int i = 0; i < length - n - 1; i++)
            current = current.next;
        
        
        current.next = current.next.next;

        return head;
    }
}