package com.dcw.leetcode;

/**
 * Happy Number
 * ��Ϊ�漰ѭ���������happy number����ֵΪ1
 * �������happ number�������뻷״ѭ����
 * ���Բ���1��2��������ֲ�����1�����ֲ�����ֵ��ͬ��˵������happy number
 * @author topdc
 *
 */
public class Solution_202 {
	public boolean isHappy(int n) {
        int x=n;
        int y=n;
        while(x>1){
        	x=cal(x);
        	if(x==1)
        		return true;
        	y=cal(cal(y));//������
        	if(y==1)
        		return true;
        	if(x==y)
        		return false;
        }
		return true;
    }
	//�����λ����ƽ���ĺ�
	private int cal(int x){
		int ret=0;
		
		while(x>0){
			ret+=(x%10)*(x%10);
			x=x/10;
		}
		return ret;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
