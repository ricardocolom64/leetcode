/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null)
            return head;
        
        Node originalCurr = head;
        Node copyHead = new Node(head.val);
        Node copyCurr = copyHead;
        
        ArrayList<Node> originalNodes = new ArrayList<Node>();
        ArrayList<Node> copyNodes = new ArrayList<Node>();
        
        while(originalCurr != null)
        {
            originalNodes.add(originalCurr);
            copyCurr.val = originalCurr.val;
            
            if(originalCurr.next != null)
            {
                copyCurr.next = new Node(originalCurr.next.val);
            }
            
            copyNodes.add(copyCurr);
            
            originalCurr = originalCurr.next;
            copyCurr = copyCurr.next;
        }
        
        copyCurr = copyHead;
        int pos = 0;
        
        originalCurr = head;
        
        while(originalCurr != null){
            
            if(originalCurr.random != null)
            {
                pos = originalNodes.indexOf(originalCurr.random);
                //System.out.println("pos of random is " + pos);
                copyCurr.random = copyNodes.get(pos);
            }
            
            originalCurr = originalCurr.next;
            copyCurr = copyCurr.next;
            pos++;
        }
        
        return copyHead;
    }
}