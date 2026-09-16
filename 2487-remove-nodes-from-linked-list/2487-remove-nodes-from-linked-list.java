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
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        ListNode current = head;
        ListNode prev = null;
        int maxSeen = Integer.MIN_VALUE;

        while(current != null)
        {
            if(current.val >= maxSeen)
            {
                maxSeen = current.val;
                prev = current;
            }
            else
            {
                prev.next = current.next;
            }
            current = current.next; 
        }

        return reverseList(head);

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }
        return prev;
    }

}
