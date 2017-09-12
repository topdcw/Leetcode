package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * N-Queens
 * n*n的国际象棋棋盘上上摆放n个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法 
 * 
 * 使用递归。
 * 用一个一维数组来表示相应行对应的列，比如c[i]=j表示， 第i行的皇后放在第j列。
 * 如果当前行是r，皇后放在哪一列呢？c[r]列。 一共有8列，所以我们要让c[r]依次取第0列，第1列，第2列……一直到第7列， 
 * 每取一次我们就去考虑，皇后放的位置会不会和前面已经放了的皇后有冲突。 怎样是有冲突呢？同行，同列，对角线。由于
 * 已经不会同行了，所以不用考虑这一点。 同列：c[r]==c[j]; 同对角线有两种可能，即主对角线方向和副对角线方向。 主对
 * 角线方向满足，行之差等于列之差：r-j==c[r]-c[j]; 副对角线方向满足，  * 行之差等于列之差的相反数：r-j==c[j]-c[r]。 
 * 只有满足了当前皇后和前面所有的皇后都不会互相攻击的时候，才能进入下一级递归。
 * @author dong
 *
 */
public class Solution_51 {

	int num;
	int []data;//下标表示行数，值表示列数。
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
		if(r==num){//完成排列,写入
			addret();
			return;
		}
		else{
			for(int i=0;i<num;i++){
				data[r]=i;
				int ok=1;
				for(int j=0;j<r;j++){//判断是否与前面的位置有冲突
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
