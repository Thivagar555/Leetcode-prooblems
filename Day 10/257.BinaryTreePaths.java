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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        if(root==null) return result;

        Dfs(root, "", result);
        return result;
    }

    public void Dfs(TreeNode node, String path, List<String> result)

    {
        if(node==null) return; // if any one of the node is null we want to check the another node, This helps to do that thing.

        path += node.val;

        if(node.left == null && node.right == null){
            result.add(path);
        }
        else 
        {
            path += "->";
            Dfs(node.left, path, result);
            Dfs(node.right, path, result);
        }

    }
}