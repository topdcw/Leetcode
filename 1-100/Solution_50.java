package com.dcw.leetcode;
/**
 * Pow(x, n)
 * ע��߽�����
 * @author topdc
 *
 */
public class Solution_50 {

	public double myPow(double x, int n) {
		if(n==0||x==1)
			return 1;
		if(x==-1)
			return n%2==0?1:-1;
		
		double ret=1;
		long newn=n;//��n����Ϊlong
        if(newn<0){//�Ƚ�newnת��Ϊ����
        	newn=-newn;
        	x=1/x;
        }
        int sign=1;//����x������
        if(x<0)
    	   sign=-1;
    	x=Math.abs(x);
        
    	if(x>1){
    		double flag=Double.MAX_VALUE/x;
    		for(int i=0;i<newn;i++){
    			if(ret>flag){
    				ret=Double.MAX_VALUE;
    				break;
    			}
    				
    			ret=ret*x;
    		}
    	}
    	else{
    		double flag=Double.MIN_VALUE/x;
    		for(int i=0;i<newn;i++){
    			if(ret<flag){
    				ret=0;//ret=Double.MIN_VALUE
    				break;
    			}
    				
    			ret=ret*x;
    		}
    	}
        
    	if(newn%2==0)//nΪż���Ļ��������sign�޹�
    		return ret;
    	else
    		return ret*sign;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_50 s=new Solution_50();
		System.out.println(s.myPow(1, 2147483647));
	}

}
