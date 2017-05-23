package com.dcw.leetcode;


/**
 *Convert Sorted Array to Binary Search Tree   
 *
 * @author topdc
 *
 */
public class Solution_108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0)
			return null;
		
      
        
        return createTree(nums, 0, nums.length-1);
    }
	TreeNode createTree(int[]nums,int from,int to){
		int mid=(from+to)/2;
		TreeNode ret=new TreeNode(nums[mid]);
		if(mid==from)
			ret.left=null;
		else
			ret.left=createTree(nums, from, mid-1);
		
		if(mid==to)
			ret.right=null;
		else
			ret.right=createTree(nums, mid+1, to);
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
