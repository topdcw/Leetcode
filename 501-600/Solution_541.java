package com.dcw.leetcode;


/**
 * Reverse String II��ÿ2k����ǰk�����з�ת��
 * ��ת��Ϊ����
 * @author topdc
 *
 */
public class Solution_541 {
	
	public String reverseStr(String s, int k) {
		char chs[]=s.toCharArray();
		int n=s.length()/(2*k);//�ܻ��ɶ�����
		int remain=s.length()%(2*k);//����
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
