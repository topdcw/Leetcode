package com.dcw.leetcode;
/**
 * Pow(x, n)
 * 注意边界条件
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
		long newn=n;//将n升级为long
        if(newn<0){//先将newn转化为正数
        	newn=-newn;
        	x=1/x;
        }
        int sign=1;//代表x的正负
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
        
    	if(newn%2==0)//n为偶数的话，结果和sign无关
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
