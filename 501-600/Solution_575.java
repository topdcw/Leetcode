package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Distribute Candies
 * ʹ��hash���������
 * @author Dong
 *
 */
public class Solution_575 {

	public int distributeCandies(int[] candies) {
        HashSet<Integer> hs=new HashSet<>();
        int ret=0;
        //�����ж����ֲ�ͬ���ǹ�
        for (int i = 0; i < candies.length; i++) {
			if(!hs.contains(candies[i])){
				hs.add(candies[i]);
				ret++;
			}
		}
        //��Ϊ��ƽ�֣����ret>�ǹ�����һ�룬�򷵻��ǹ�����һ�룬��ʾ�ֵܷõ����������
        if(ret<=candies.length/2)
        	return ret;
        else
        	return candies.length/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
