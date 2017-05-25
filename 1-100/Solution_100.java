package com.dcw.leetcode;

/**
 * Same Tree 
 * 
 * @author Dong
 *
 */
public class Solution_100 {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null){
        	if(p.val!=q.val)
        		return false;
        	else
        		if(!isSameTree(p.left, q.left)||!isSameTree(p.right, q.right))
        			return false;
        }
        else
        	if((p==null&&q!=null)||(q==null&&p!=null))
        		return false;

        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
