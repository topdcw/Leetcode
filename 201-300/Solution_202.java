package com.dcw.leetcode;

/**
 * Happy Number
 * 因为涉及循环，如果是happy number最后的值为1
 * 如果不是happ number，则陷入环状循环。
 * 所以步进1和2，如果出现不属于1的两种步进的值相同，说明不是happy number
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
        	y=cal(cal(y));//两步进
        	if(y==1)
        		return true;
        	if(x==y)
        		return false;
        }
		return true;
    }
	//计算各位数字平方的和
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
