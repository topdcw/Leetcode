package com.dcw.leetcode;


//判断一个数是不是两个数的平方和
public class Solution_633 {

	public boolean judgeSquareSum(int c) {
		int mid=(int)Math.sqrt(c);
		if(mid*mid==c)
			return true;
//		for(int i=1;i<=mid;i++){
//			int tmp=c-i*i;
//			int k=(int)Math.sqrt(tmp);
//			if(k*k==tmp)
//				return true;
//		}
		int i=1;
		while(i<=mid){
			int x=i*i+mid*mid;
			if(x==c){
				return true;
			}
			if(x<c)
				i++;
			if(x>c)
				mid--;
		}
		
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_633 s=new Solution_633();
		System.out.println(s.judgeSquareSum(10000));
	}

}
