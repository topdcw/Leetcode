package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses
 * ����ջʵ��
 * ��������
 * @author topdc
 *
 */
public class Solution_22 {
	int []count = new int[2];//���� ��ʾջ�⣨�ͣ��ĸ�����count[0]�ǣ��ĸ�����count[1]�ǣ��ĸ���
	List<Character> list = new ArrayList<Character>();
	int num;
	List<String> ret = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		count[0]=count[1]=n;
		num = n;
		
		return ret;
    }
	
	//���õݹ�ʵ�֣����count[0]����0������ջ�����count[1]>count[0],(��ջ
	public void katelan(){
		if(count[0]>0){
			//��ջ
			list.add('(');
			count[0]--;
			katelan();//�ݹ����
			//��ջ
			list.remove(list.size()-1);
			count[0]++;
		}
		if(count[1]>count[0]){
			list.add(')');
			count[1]--;
			katelan();//�ݹ����
			//��ջ
			list.remove(list.size()-1);
			count[1]++;
		}
		if(list.size()==2*num){
			System.out.println(list.toString());
			ret.add(list.toString());
		}
	}
}
