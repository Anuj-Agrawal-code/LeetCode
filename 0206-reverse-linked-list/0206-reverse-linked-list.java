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
            ListNode prev = null;
            ListNode curr = head;

            return rev(prev, curr);                        
    }

    public static ListNode rev(ListNode prev, ListNode curr)
    {
        if(curr == null)
            return prev;
            
        ListNode next_node = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next_node;

        return rev(prev, curr);
    }
}