/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        
        if(root.val % 2 == 0)
            return false;
        
        nodeQ.add(root);
        nodeQ.add(null);
        
        ArrayList<ArrayList<Integer>> levelNums = new ArrayList<ArrayList<Integer>>();
        
        levelNums.add(new ArrayList<>());
        
        int currLevel = 0;
        
        while(!nodeQ.isEmpty())
        {
            TreeNode head = nodeQ.peek();
            
            if(head != null)
            {
                if(levelNums.size() == currLevel)
                {
                    levelNums.add(new ArrayList<>());
                }
                levelNums.get(currLevel).add(nodeQ.peek().val);
                
                if(head.left != null)
                    nodeQ.add(head.left);
                if(head.right != null)
                    nodeQ.add(head.right);
            }
            else
            {
                if(nodeQ.size() > 1)
                {
                    nodeQ.add(null);
                    currLevel++;
                }
            }
            nodeQ.remove();
        }
        
        for(int i = 0; i < levelNums.size(); ++i)
        {
            int currIndex = 0;
            //Even level
            if(i % 2 == 0)
            {
                System.out.println(i + " -> " + isOddAndIncreasing(levelNums.get(i)));
                if(!isOddAndIncreasing(levelNums.get(i)))
                   return false;
            }
            //Odd level
            else
            {
                System.out.println(i + " -> " + isEvenAndDecreasing(levelNums.get(i)));
                if(!isEvenAndDecreasing(levelNums.get(i)))
                   return false;
            }
        }        
        return true;
    }
    
    public boolean isOddAndIncreasing(ArrayList<Integer> list)
    {
        if(list.size() > 1)
        {
            for(int i = 0; i < list.size() - 1; ++i)
            {
                if(list.get(i) >= list.get(i + 1))
                    return false;
                if(list.get(i) % 2 == 0)
                    return false;
            }
            
            if(list.get(list.size() - 1) % 2 == 0)
                return false;
        }
        else
        {
            if(list.get(0) % 2 == 0)
                return false;
        }
        return true;
    }
    
    public boolean isEvenAndDecreasing(ArrayList<Integer> list)
    {
        if(list.size() > 1)
        {
            for(int i = 0; i < list.size() - 1; ++i)
            {
                if(list.get(i) <= list.get(i + 1))
                    return false;
                if(list.get(i) % 2 == 1)
                    return false;
            }
            
            if(list.get(list.size() - 1) % 2 == 1)
                return false;
        }
        else
        {
            if(list.get(0) % 2 == 1)
                return false;
        }
        return true;
    }
}