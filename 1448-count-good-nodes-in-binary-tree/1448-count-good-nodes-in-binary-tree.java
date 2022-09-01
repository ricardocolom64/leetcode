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
    
    int goodNodes = 0;    
    
    public int goodNodes(TreeNode root) {
        searchTree(root, root.val);
        return goodNodes;
    }
    
    public void searchTree(TreeNode node, int max)
    {
        if(node == null)
        {
            return;            
        }
        
        if(node.val >= max)
        {
            goodNodes++;
            max = node.val;
        }
        
        searchTree(node.left, max);
        searchTree(node.right, max);
    }
}