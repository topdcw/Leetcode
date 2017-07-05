package com.dcw.leetcode;

/**
 *  Add Binary
 *  二进制加法
 * @author topdc
 *
 */
public class Solution_67 {
	public String addBinary(String a, String b) {
        StringBuilder ret=new StringBuilder();
        //保证a的长度大于等于b的长度
        if(a.length()<b.length()){
        	String t=b;
        	b=a;
        	a=t;
        }
        System.out.println(a+"  "+b);
        int c=0;//表示进位
		for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
			if(j>=0){
				int tmp=a.charAt(i)-'0'+b.charAt(j)-'0'+c;
				c=tmp/2;
				ret.append(tmp%2);
			}
			else{
				if(c==0)
					ret.append(a.charAt(i));
				else{
					int tmp=a.charAt(i)-'0'+c;
					c=tmp/2;
					ret.append(tmp%2);
				}
			}
		}
		if(c!=0)
			ret.append(c);
		ret=ret.reverse();
		return ret.toString();
    }
	public static void main(String[] args) {
		Solution_67 s=new Solution_67();
		System.out.println(s.addBinary("100", "110010"));
	}
}
