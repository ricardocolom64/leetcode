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
    ArrayList<Integer> currLevel = new ArrayList<Integer>();
    
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        List<Double> avgLvls = new ArrayList<Double>();
        
        nodeQ.add(root);
        nodeQ.add(null);
        
        while(!nodeQ.isEmpty())
        {
            TreeNode head = nodeQ.remove();
            
            if(head != null)
            {
                //System.out.println(head.val);
                currLevel.add(head.val);
                
                if(head.left != null)
                    nodeQ.add(head.left);
                
                if(head.right != null)
                    nodeQ.add(head.right);
            }
            else
            {
                //System.out.println("null");
                double sum = 0.0;
                for(int i = 0; i < currLevel.size(); ++i)
                {
                    sum += currLevel.get(i);
                }
                double avg = sum / (double)currLevel.size();
                System.out.println(avg);
                
                avgLvls.add(avg);
                currLevel.clear();
                
                //System.out.println("nodeQ size is " + nodeQ.size());
                if(nodeQ.size() > 0)
                {
                    nodeQ.add(null);
                }
            }
        }
        
        return avgLvls;
    }
}