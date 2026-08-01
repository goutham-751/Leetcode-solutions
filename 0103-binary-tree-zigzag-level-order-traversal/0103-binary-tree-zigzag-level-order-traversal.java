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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int currentlevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currlist=new LinkedList<>();
            if(currentlevel%2==0){
                for(int i=0;i<size;i++){
                    TreeNode curr=q.poll();
                    currlist.addLast(curr.val);
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
            else{
                for(int i=0;i<size;i++){
                    TreeNode curr=q.poll();
                    currlist.addFirst(curr.val);
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }

            }
            currentlevel++;
            list.add(currlist);
        }
        return list;
    }
}