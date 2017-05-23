package com.dcw.leetcode;


/**
 * Reverse String II（每2k个，前k个进行翻转）
 * 先转化为数组
 * @author topdc
 *
 */
public class Solution_541 {
	
	public String reverseStr(String s, int k) {
		char chs[]=s.toCharArray();
		int n=s.length()/(2*k);//能化成多少组
		int remain=s.length()%(2*k);//余数
        for(int i=0;i<n;i++){
        	reverseArray(chs, i*2*k, i*2*k+k-1);
        }
        if(remain>0){
        	if(remain>k)
        		reverseArray(chs, n*2*k, n*2*k+k-1);
        	else
        		reverseArray(chs, n*2*k, n*2*k+remain-1);
        }
        return String.valueOf(chs);
    }
	
	private void reverseArray(char[]chs,int from,int to){
		char tmp;
		while(from<to){
			tmp=chs[from];
			chs[from++]=chs[to];
			chs[to--]=tmp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc".length());
	}

}
