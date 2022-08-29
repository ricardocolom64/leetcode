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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int currSum = 0;
        
        ListNode l1curr = l1;
        ListNode l2curr = l2;
        
        ListNode result = new ListNode();
        ListNode curr = result;
        
        while(l1curr != null || l2curr != null)
        {
            int x = 0;
            int y = 0;
            
            if(l1curr != null)
                x = l1curr.val;
            
            if(l2curr != null)
                y = l2curr.val;
            
            currSum = x + y + carry;
            carry = 0;
            
            if(currSum >= 10)
            {
                carry = currSum / 10;
                currSum = currSum % 10;
            }
            
            curr.val = currSum;
            
            if(l1curr != null)
                l1curr = l1curr.next;
            
            if(l2curr != null)
                l2curr = l2curr.next;
            
            if(l1curr != null || l2curr != null)
            {                
                curr.next = new ListNode(0, null);
                curr = curr.next;
            }
        }
        
        if(carry != 0)
            curr.next = new ListNode(carry, null);
        
        return result;
    }
}