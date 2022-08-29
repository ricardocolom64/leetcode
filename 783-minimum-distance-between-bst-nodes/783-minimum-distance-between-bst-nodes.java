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
    List<Integer> sortedNodes = new ArrayList<Integer>();
    public int minDiffInBST(TreeNode root) {
        searchTree(root);
        
        int min = sortedNodes.get(sortedNodes.size() - 1);
        
        for(int i = 1; i < sortedNodes.size(); ++i)
        {
            if(sortedNodes.get(i) - sortedNodes.get(i - 1) < min)
                min = sortedNodes.get(i) - sortedNodes.get(i - 1);
        }
        
        return min;
    }
    
    public void searchTree(TreeNode node)
    {
        if(node == null)
            return;
        
        searchTree(node.left);
        sortedNodes.add(node.val);
        searchTree(node.right);
    }
}