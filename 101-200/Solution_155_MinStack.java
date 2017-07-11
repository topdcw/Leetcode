package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Min Stack
 * �Լ�����һ��ջ��ʵ����ع��ܣ�����List��Ϊ�ײ�
 * ����Сֵ��Ԫ�ؼ佨��������x=x-min��
 * @author Dong
 *
 */
public class Solution_155_MinStack {
	/** initialize your data structure here. */
	long min=Integer.MAX_VALUE;
	List<Long> list =new ArrayList<>();
    public Solution_155_MinStack() {
		// TODO Auto-generated constructor stub
	}
    public void push(int x) {
    	if(list.isEmpty()){
    		min=x;
    		list.add(x-min);
    	}
    	else{
    		list.add(x-min);
    		min=x<min?x:min;
    	}
    }
    
    public void pop() {
    	long r=list.get(list.size()-1);
    	if(r<0)
    		min=min-r;
        list.remove(list.size()-1);
    }
    
    public int top() {
    	long r=list.get(list.size()-1);
    	if(r<0)
    		return (int)min;
    	else
    		return (int) (r+min);
    }
    
    public int getMin() {
    	
        return (int) min;
    }
}

