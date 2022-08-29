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
        
        int temp = 0;
        
        while(l1curr != null || l2curr != null)
        {
            System.out.println("--");
            int x = 0;
            int y = 0;
            
            if(l1curr != null)
                x = l1curr.val;
            
            if(l2curr != null)
                y = l2curr.val;
            
            System.out.print("x = " + x + " ");
            System.out.print("y = " + y + " ");
            
            currSum = x + y + carry;
            carry = 0;
            
            if(currSum >= 10)
            {
                carry = currSum / 10;
                currSum = currSum % 10;
            }
            
            curr.val = currSum;
            System.out.println(currSum);
            
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