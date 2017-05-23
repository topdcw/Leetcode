package com.dcw.leetcode;


/**
 * Implement strStr()
 * ���Ӵ���λ�ã���������Ӵ�������-1�����needle�ǿմ�������0
 * ʹ��KMP�㷨,���������ݡ�
 * @author topdc
 *
 */
public class Solution_28 {
	public int strStr(String haystack, String needle) {
		//needle����Ϊ0��Ϊ1��������haystack���ȵ����
		if(needle.length()==0)
		    return 0;
		if(needle.length()==1){
			for(int i=0;i<haystack.length();i++){
				if(haystack.charAt(i)==needle.charAt(0))//�ҵ���һ�γ��ֵ�λ�÷���
					return i;
			}
			return -1;
		}
		if(needle.length()>haystack.length()){
			return -1;
		}
		//needle����>=2�����
		int[] index = new int[needle.length()];//���ڼ�¼��ƥ��ʱ����һ������ƥ���λ�á�
		buildindex(index,needle);
		
		//��ƥ�䡣����������
		int i,j;
		i=j=0;
		int l1=haystack.length();
		int l2=needle.length();
		while(i<l1&&j<l2){
			while(j!=-1){
				if(haystack.charAt(i)==needle.charAt(j)){
					i++;
					j++;
					break;
				}
				else{
					j=index[j];
				}
			}
			if(j==-1){
				i++;
				j=0;
			}			
		}
		if(j==l2){//˵��ƥ��ɹ�
			return i-l2;
		}
		else
			return -1;
	}

	private void buildindex(int[] index,String needle){
		
		index[0]=-1;//��ʾ��ƥ��Ļ���������Ҫ���ơ�
		index[1]=0;
		for(int i=2;i<index.length;i++){
			int j=index[i-1];
			while(j!=-1){
				if(needle.charAt(i-1)==needle.charAt(j)){
					index[i]=j+1;
					break;
				}
				else{
					j=index[j];
				}
			}
			if(j==-1)
				index[i]=0;
		}	
		
	}
}

