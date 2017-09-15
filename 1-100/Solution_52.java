package com.dcw.leetcode;

/**
 * N-Queens II
 * ��51�����ƣ���������ĿҪ��������̵�������
 * �ⷨ��51�����ƣ����ݷ����ݹ�ʵ��
 * @author dong
 *
 */
public class Solution_52 {

	int ret=0;
	int num;
	int []data;
	public int totalNQueens(int n) {
        num=n;
        data=new int[n];//�����±��ʾ�У�ֵ��ʾ���е���һ��������
        search(0);
		return ret;
    }
	
	void search(int r){//
		if(r==num){
			ret++;
		}
		else{
			for(int i=0;i<num;i++){
				data[r]=i;
				int ok=1;
				for(int j=0;j<r;j++){//����ǰr-1�е������Ƿ��ͻ
					if(data[j]==data[r]||data[r]-data[j]==r-j||data[r]-data[j]==j-r){
						ok=0;//��ǰr-1�е����ݳ��ֳ�ͻ
						break;
					}
				}
				if(ok==1)
					search(r+1);//��һ��
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
