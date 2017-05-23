package com.dcw.leetcode;



/**
 *  Longest Valid Parentheses
 *  使用动态规划
 *  定义d[i]表示从s[i]到s[n-1]的最长有效括号（包括s[i]）
 *  则d[i]和d[i+1]存在数量关系：
 *  如果s[i]是（，且i+1+d[i+1]不越界， 且s[i+1+d[i+1]])是）。则d[i]=d[i+1]+2
 *  	进而若d[i+1+d[i+1]+1]存在，则d[i]=d[i]+d[i+1+d[i+1]+1];
 *  其余d[i]均为0
 * @author topdc
 *
 */
public class Solution_32 {

	public int longestValidParentheses(String s) {
		int max=0;
		if(s.length()==0){
			return max;
		}
		//初始化操作
		int n= s.length();
		int []d= new int[n];
		d[n-1]=0;
		
		//构造d[]
		for(int i= n-2;i>=0;i--){
			if(s.charAt(i)=='('){
				if(i+1+d[i+1]<=n-1&&s.charAt(i+1+d[i+1])==')'){//i+1+d[i+1]有效
					d[i]=d[i+1]+2;//如果s[i]和s[i+1+d[i+1]]匹配
					if(i+1+d[i+1]+1<=n-1)//d[i+1+d[i+1]+1]存在
						d[i]+=d[i+1+d[i+1]+1];
				}
				else{
					d[i]=0;
				}
			}
			else{
				d[i]=0;
			}
		}
		for (int i : d) {
			if(max<i)
				max=i;
		}
		return max;
    }
}
