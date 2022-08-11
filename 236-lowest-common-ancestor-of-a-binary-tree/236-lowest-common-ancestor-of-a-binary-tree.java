/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


/**

[3, 5]

[3, 1]


[3, 5, 6]

[3, 5, 2, 4]


**/



class Solution {
    Stack<TreeNode> path = new Stack<TreeNode>();
    
    ArrayList<TreeNode> pathP = new ArrayList<TreeNode>();
    ArrayList<TreeNode> pathQ = new ArrayList<TreeNode>();
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root, p, q);
        
        for(int i = pathP.size() - 1; i >= 0; --i)
        {
            for(int j = pathQ.size() - 1; j >= 0; --j)
            {
                if(pathP.get(i).val == pathQ.get(j).val)
                {
                    System.out.println("LCA is " + pathP.get(i).val);
                    return pathP.get(i);                    
                }
            }
        }
        
        return null;
    }
    
    public void search(TreeNode node, TreeNode p, TreeNode q)
    {
        if(node == null)
        {
            return;        
        }
        
        path.push(node);
        
        search(node.left, p, q);
        search(node.right, p, q);
        
        if(node.val == p.val)
        {
            Object[] currPath = path.toArray();
            for(int i = 0; i < currPath.length; ++i)
                pathP.add((TreeNode)currPath[i]);
            
            for(int i = 0; i < pathP.size(); ++i)
                System.out.println(pathP.get(i).val);
            
            System.out.println("--");
        }
        if(node.val == q.val)
        {
            Object[] currPath = path.toArray();
            for(int i = 0; i < currPath.length; ++i)
                pathQ.add((TreeNode)currPath[i]);
            for(int i = 0; i < pathQ.size(); ++i)
                System.out.println(pathQ.get(i).val);        
            
            System.out.println("--");
        }
        path.pop();
    }
}