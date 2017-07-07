package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Construct String from Binary Tree
 * 将树转化为有规则的字符串
 * @author topdc
 *
 */
public class Solution_606 {
	List<String> ret=new ArrayList<>();
	public String tree2str(TreeNode t) {
		preOrder(t);
		StringBuilder r=new StringBuilder();
		for(String c:ret){
			r.append(c);
		}
		
        return  r.toString();
		
    }
	private void preOrder(TreeNode root){
		if(root!=null){
			ret.add(Integer.toString(root.val));
			if(root.left==null){
				if(root.right!=null){
					ret.add("(");
					ret.add(")");
					ret.add("(");
					preOrder(root.right);
					ret.add(")");
				}
			}
			else{
				ret.add("(");
				preOrder(root.left);
				ret.add(")");
				if(root.right!=null){
					ret.add("(");
					preOrder(root.right);
					ret.add(")");
				}
			}
		}
	}
}
