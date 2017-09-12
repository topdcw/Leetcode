package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * N-Queens
 * n*n�Ĺ��������������ϰڷ�n���ʺ�ʹ�䲻�ܻ��๥���������������ʺ󶼲��ܴ���ͬһ�С�ͬһ�л�ͬһб���ϣ����ж����ְڷ� 
 * 
 * ʹ�õݹ顣
 * ��һ��һά��������ʾ��Ӧ�ж�Ӧ���У�����c[i]=j��ʾ�� ��i�еĻʺ���ڵ�j�С�
 * �����ǰ����r���ʺ������һ���أ�c[r]�С� һ����8�У���������Ҫ��c[r]����ȡ��0�У���1�У���2�С���һֱ����7�У� 
 * ÿȡһ�����Ǿ�ȥ���ǣ��ʺ�ŵ�λ�û᲻���ǰ���Ѿ����˵Ļʺ��г�ͻ�� �������г�ͻ�أ�ͬ�У�ͬ�У��Խ��ߡ�����
 * �Ѿ�����ͬ���ˣ����Բ��ÿ�����һ�㡣 ͬ�У�c[r]==c[j]; ͬ�Խ��������ֿ��ܣ������Խ��߷���͸��Խ��߷��� ����
 * ���߷������㣬��֮�������֮�r-j==c[r]-c[j]; ���Խ��߷������㣬  * ��֮�������֮����෴����r-j==c[j]-c[r]�� 
 * ֻ�������˵�ǰ�ʺ��ǰ�����еĻʺ󶼲��ụ�๥����ʱ�򣬲��ܽ�����һ���ݹ顣
 * @author dong
 *
 */
public class Solution_51 {

	int num;
	int []data;//�±��ʾ������ֵ��ʾ������
	List<List<String>> ret=new ArrayList<List<String>>();
	public List<List<String>> solveNQueens(int n) {
		data=new int[n];
		num=n;
		search(0);
		
		return ret;
    }
	
	void addret(){
		List<String> tmp=new ArrayList<>();
		for(int i=0;i<num;i++){
			StringBuilder s=new StringBuilder();
			for(int j=0;j<num;j++){
				if(j==data[i])
					s.append('Q');
				else
					s.append('.');
			}
			tmp.add(s.toString());
		}
		ret.add(tmp);
	}
	void search(int r){
		if(r==num){//�������,д��
			addret();
			return;
		}
		else{
			for(int i=0;i<num;i++){
				data[r]=i;
				int ok=1;
				for(int j=0;j<r;j++){//�ж��Ƿ���ǰ���λ���г�ͻ
					if(data[r]==data[j]||r-j==data[r]-data[j]||r-j==data[j]-data[r]){
						ok=0;
						break;
					}
				}
				if(ok==1)
					search(r+1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
