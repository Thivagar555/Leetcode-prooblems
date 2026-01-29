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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
         preOrder(root, result);
        //ROOT LEFT RIGHT 
        return result;
    }
    //recursion function to do search
    private void preOrder(TreeNode node, List<Integer> result)
    {
         if(node == null)
         return;

         //store the data of the node - root
         result.add(node.val);

         //add the left node data or traverse along left node
         preOrder(node.left , result);

         //add the right node data or traverse along right node
         preOrder(node.right, result);
    }
}