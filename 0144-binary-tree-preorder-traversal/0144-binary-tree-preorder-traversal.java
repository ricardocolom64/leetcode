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
    
    List<Integer> result = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        searchTree(root);
        
        return result;
    }
    
    public void searchTree(TreeNode node)
    {
        if(node != null)
        {                    
            //System.out.println(node.val);
            result.add(node.val);
        }
        
        if(node == null)
            return;
        
        searchTree(node.left);
        searchTree(node.right);
    }
}