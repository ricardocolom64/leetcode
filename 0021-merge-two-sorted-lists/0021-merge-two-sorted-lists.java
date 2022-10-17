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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1curr = list1;
        ListNode list2curr = list2;
        
        ListNode newListHead = new ListNode();
        
        if(list1curr == null)
        {
            if(list2curr == null)
            {
                return null;
            }
            return list2curr;
        }
        else if(list2curr == null)
        {
            return list1curr;
        }
        else
        {
            if(list1curr.val <= list2curr.val)
            {
                newListHead.val = list1curr.val;
                list1curr = list1curr.next;
            }
            else
            {
                newListHead.val = list2curr.val;
                list2curr = list2curr.next;
            }
        }
        
        ListNode newListcurr = newListHead;
        newListcurr.next = new ListNode();
        
        boolean bothNull = false;
        
        while(!bothNull)
        {
            if(list1curr == null)
            {
               if(list2curr != null)
               {
                   //System.out.println("list1curr is null, incrementing list2 which is " + list2curr.val);
                   newListcurr.next = new ListNode(list2curr.val);
                   list2curr = list2curr.next;
               }
            }
            else if (list2curr == null)
            {
                //System.out.println("list2curr is null, incrementing list1 which is " + list1curr.val);
                newListcurr.next = new ListNode(list1curr.val);
                list1curr = list1curr.next;
            }
            else
            {
                if(list1curr.val <= list2curr.val)
                {
                    //System.out.println("list1: " + list1curr.val + " is less than list2: " + list2.val);
                    newListcurr.next = new ListNode(list1curr.val);
                    list1curr = list1curr.next;
                }
                else
                {
                    //System.out.println("list2: " + list2curr.val + " is greater than list1: " + list1.val);
                    newListcurr.next = new ListNode(list2curr.val);
                    list2curr = list2curr.next;
                }
            }
            
            //System.out.println("newListcurr.val: " + newListcurr.val);
            newListcurr = newListcurr.next;
            
            if(list1curr == null && list2curr == null)
                bothNull = true;
        }
        
        return newListHead;
    }
}