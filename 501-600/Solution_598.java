package com.dcw.leetcode;

/**
 * Range Addition II  
 * ���ops�е���Ϣ����m*n��������Ӧ��Χ����+1������
 * �����������֣�����Ҫ��m*n������ʵ�ʽ���+1������
 * ops�����б�ʾ������Ľ�����������ָ������ǽ����
 * @author topdc
 *
 */
public class Solution_598 {
	public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
        	return m*n;
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
			if(a>ops[i][0])
				a=ops[i][0];
			if(b>ops[i][1])
				b=ops[i][1];
		}
        return a*b;
    }
	public static void main(String[] args) {
		Solution_598 s=new Solution_598();
		System.out.println(s.maxCount(40000, 40000, new int[0][0]));
	}
}
