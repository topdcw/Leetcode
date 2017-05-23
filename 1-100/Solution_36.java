package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Valid Sudoku
 * 思路：先每一行，每一列看是否满足。再按9个九宫格进行查看判断。
 * 使用了hashset加快判断速度
 * 
 * @author topdc
 *
 */
public class Solution_36 {
	private HashSet<Character> hashset =new HashSet<Character>();
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hashset1 =new HashSet<Character>();//横向比较
		HashSet<Character> hashset2 =new HashSet<Character>();//纵向
		//行列判断
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				//行判断
				if(hashset1.contains(board[i][j])){
					return false;//出现重复,不满足数独要求
				}
				else if(board[i][j]!='.'){
					hashset1.add(board[i][j]);//将非‘.’字符添加进set1中
				}
				//列判断
				if(hashset2.contains(board[j][i])){
					return false;//出现重复,不满足数独要求
				}
				else if(board[j][i]!='.'){
					hashset2.add(board[j][i]);//将非‘.’字符添加进set2中
				}
			}
			hashset1.clear();//处理完一行后进行清空
			hashset2.clear();//处理完一行后进行清空
		}
		
		//九宫格判断
		for(int i=0;i<9;i+=3){
			for(int j=0;j<9;j+=3){
				if(!NineJudge(board,i,j)){//如果返回是false
					return false;
				}
			}
		}
		return true;
    }
	
	//一个九宫格判断函数
	private boolean NineJudge(char[][] board,int hang,int lie){
		for(int i=hang;i<hang+3;i++){
			for(int j=lie;j<lie+3;j++){
				if(hashset.contains(board[i][j])){
					return false;//出现重复,不满足数独要求
				}
				else if(board[i][j]!='.'){
					hashset.add(board[i][j]);//将非‘.’字符添加进set1中
				}
			}
		}
		hashset.clear();//清空，方便下次使用
		return true;
	}
}
