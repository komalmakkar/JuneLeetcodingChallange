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
    
    /* TDD Test cases.
     *[4,2,7,1,3,6,9]
     *[0]
     *[0,1]
     *[]
     *[1,2,3,4,5]
     *[0,null,1,null,2,null,3]
     */
    
    /// Utility method where actual inversion is performed.
    private void swapChildren(TreeNode root)
    {
        TreeNode temporaryNode = root.left;
        root.left = root.right;
        root.right = temporaryNode;
    }
    
    // The break condion checked is root == null. 
    public TreeNode invertTree(TreeNode root) 
    {
        if (root != null)
        { 
            swapChildren(root);
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
