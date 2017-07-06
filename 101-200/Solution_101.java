package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Symmetric Tree 
 * 思路：使用递归算法，将整体数的对称性转化为对子树对称性的判断
 * 整体问题转化为子问题。
 * @author topdc
 *
 */
public class Solution_101 {
	List<Integer> list=new ArrayList<>();
	public boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		else
			return subIsSymmetric(root.left, root.right);
        
    }
	private boolean subIsSymmetric(TreeNode left,TreeNode right){//二层子树对称性的判断
		if(left==null||right==null)
			return left==right;//其中一个不为空则不对称
		if(left.val!=right.val)
			return false;
		return subIsSymmetric(left.left, right.right)&&subIsSymmetric(left.right, right.left);//对应的子树也需要对称
	}
}
