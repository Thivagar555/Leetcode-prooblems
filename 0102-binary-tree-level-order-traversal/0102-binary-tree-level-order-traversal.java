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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //BFS and queue logic
        
        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
        return result;

        queue.offer(root);

        while(!queue.isEmpty())
        {
            List<Integer> list = new ArrayList<>();
            //this says the current level size of the tree
            int listSize = queue.size();
            //add the elements in current level to the list
            for(int i=0; i<listSize; i++)
            {
                 //it brings the first ele and delete it
                TreeNode current = queue.poll();
                list.add(current.val);
                //and add the current node childs in queue
                if(current.left!=null)
                {
                    queue.offer(current.left);
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}