package com.dcw.leetcode;

/**Binary Tree Tilt
 * 
 * @author Dong
 *
 */
public class Solution_563 {
	int ret=0;
	public int findTilt(TreeNode root) {
		
		calculateTilt(root);
        return ret;
        
    }
	//计算tilt
	private void calculateTilt(TreeNode root){
		if(root==null)
			return ;
		ret+=Math.abs(calculateSum(root.left)-calculateSum(root.right));
		calculateTilt(root.left);
		calculateTilt(root.right);
		
	}
	//计算以root为根的树所有节点之和,用递归
	private int calculateSum(TreeNode root){
		if(root==null)
			return 0;
		int ret=root.val+calculateSum(root.left)+calculateSum(root.right);
		
		return ret;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
