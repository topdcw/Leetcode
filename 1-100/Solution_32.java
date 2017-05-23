package com.dcw.leetcode;



/**
 *  Longest Valid Parentheses
 *  ʹ�ö�̬�滮
 *  ����d[i]��ʾ��s[i]��s[n-1]�����Ч���ţ�����s[i]��
 *  ��d[i]��d[i+1]����������ϵ��
 *  ���s[i]�ǣ�����i+1+d[i+1]��Խ�磬 ��s[i+1+d[i+1]])�ǣ�����d[i]=d[i+1]+2
 *  	������d[i+1+d[i+1]+1]���ڣ���d[i]=d[i]+d[i+1+d[i+1]+1];
 *  ����d[i]��Ϊ0
 * @author topdc
 *
 */
public class Solution_32 {

	public int longestValidParentheses(String s) {
		int max=0;
		if(s.length()==0){
			return max;
		}
		//��ʼ������
		int n= s.length();
		int []d= new int[n];
		d[n-1]=0;
		
		//����d[]
		for(int i= n-2;i>=0;i--){
			if(s.charAt(i)=='('){
				if(i+1+d[i+1]<=n-1&&s.charAt(i+1+d[i+1])==')'){//i+1+d[i+1]��Ч
					d[i]=d[i+1]+2;//���s[i]��s[i+1+d[i+1]]ƥ��
					if(i+1+d[i+1]+1<=n-1)//d[i+1+d[i+1]+1]����
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
