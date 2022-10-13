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
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        int size = 1;
        
        ListNode curr = head;
        
        while(curr.next != null)
        {
            curr = curr.next;
            size++;
        }
        
        k = k % size;
        
        for(int i = 0; i < k; ++i)
        {
            ListNode tail = head.next;
            ListNode prev = head;
            
            // Finding the tail and the prev node
            while(tail.next != null)
            {
                tail = tail.next;
                prev = prev.next;
            }
            
            tail.next = head;
            prev.next = null;
            
            head = tail;

            //System.out.println(tail.val);
            //System.out.println(prev.val);           
        }
        
        
        return head;
    }
}