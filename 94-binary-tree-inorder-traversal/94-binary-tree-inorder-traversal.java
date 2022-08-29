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
    List<Integer> inOrder = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        searchTree(root);    
        return inOrder;
    }
    
    public void searchTree(TreeNode node)
    {
        if(node == null)
            return;
        
        searchTree(node.left);
        System.out.println(node.val);
        inOrder.add(node.val);
        searchTree(node.right);
    }
}