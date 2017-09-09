package com.dcw.leetcode;

/**
 * Unique Paths   
 * ��һ����������Ͻǵ����½ǣ��ܹ��ж��ٸ�·����ÿ��ֻ�����»������ƶ���
 * ��̬�滮����Ϊʹ�÷��η��Ļ����������ظ�,ʱ�临�Ӷȴ� ��
 * @author topdc
 *
 */
public class Solution_62 {

	public int uniquePaths(int m, int n) {
		//һ��һ�е���
		int [][]data=new int [m][n];//�洢����ĵ��·����
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(j-1>=0&&i-1>=0){
					data[i][j]=data[i-1][j]+data[i][j-1];
				}
				else if(j-1>=0){
					data[i][j]=data[i][j-1];
				}
				else if(i-1>=0){
					data[i][j]=data[i-1][j];
				}
				else
					data[i][j]=1;
			}
		}
		return data[m-1][n-1];	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_62 s=new Solution_62();
		System.out.println(s.uniquePaths(20, 20));
	}

}
