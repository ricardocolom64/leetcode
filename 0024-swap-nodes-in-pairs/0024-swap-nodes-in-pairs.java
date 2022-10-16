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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        ListNode curr = head;
        
        ArrayList<ListNode> oddNodes = new ArrayList<>();
        ArrayList<ListNode> evenNodes = new ArrayList<>();
        
        int amt = 1;
        
        while(curr != null)
        {
            if(amt % 2 == 1)
                oddNodes.add(curr);
            else
                evenNodes.add(curr);
            
            amt++;
            curr = curr.next;
        }
        
        ListNode result = evenNodes.get(0);
        
        curr = result;
        
        int oddIndex = 0;
        int evenIndex = 0;
        
        oddNodes.get(oddNodes.size() - 1).next = null;
        evenNodes.get(evenNodes.size() - 1).next = null;
        
        if(evenNodes.size() == 1 && oddNodes.size() == 1)
        {
            result.next = oddNodes.get(0);
            result.next.next = null;
            
            return result;
        }
        
        for(int i = 0; i < oddNodes.size() + evenNodes.size(); ++i)
        {
            if(i % 2 == 0)
            {
                curr.next = oddNodes.get(i / 2);
            }                
            else
            {
                if((i / 2) + 1 == evenNodes.size())
                {
                    if((i / 2) + 2 == oddNodes.size())
                        curr.next = oddNodes.get((i / 2) + 1);
                    break;                    
                }
                else
                    curr.next = evenNodes.get((i / 2) + 1);
            }
            
            curr = curr.next;
        }
        
        return result;
    }
}