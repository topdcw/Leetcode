package com.dcw.leetcode;

/**
 * N-Queens II
 * 与51题类似，不过该题目要求求出棋盘的种类数
 * 解法与51题类似，回溯法。递归实现
 * @author dong
 *
 */
public class Solution_52 {

	int ret=0;
	int num;
	int []data;
	public int totalNQueens(int n) {
        num=n;
        data=new int[n];//数组下标表示行，值表示该行的哪一列有数据
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
				for(int j=0;j<r;j++){//看与前r-1行的数据是否冲突
					if(data[j]==data[r]||data[r]-data[j]==r-j||data[r]-data[j]==j-r){
						ok=0;//与前r-1行的数据出现冲突
						break;
					}
				}
				if(ok==1)
					search(r+1);//下一行
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
