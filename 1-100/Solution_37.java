package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Sudoku Solver
 * 给定一个未完成的数独，补充成一个完整的数独
 * 思路：一个一个空的判断填充，每填一个数，看在改行和该列，及该数所在的小九宫格是否correct
 * 不成功，就回溯
 * 利用递归，回溯，这一项不正确，返回到上一项中，修改k后，继续进行判定。直至成功。
 * @author topdc
 *
 */
public class Solution_37 {
	HashSet<Character> hashset1=new HashSet<Character>();
	HashSet<Character> hashset2=new HashSet<Character>();
	ArrayList<position> polist= new ArrayList<position>();
	int count=0;//用于记录回溯时第几个空位置
	
	//内部类，用于记录空的位置
	public class position{
		public int x;
		public int y;
		public position(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public void solveSudoku(char[][] board) {
		//先查找空位，存在polist中
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j]=='.')//找到空位
        			polist.add(new position(i, j));
        	}
        }
//        System.out.println(polist.size());
        //回溯法填充
        if(polist.size()==0)
        	return;
        else{
        	if(!fillblannk(board, polist.get(count).x, polist.get(count).y)){
        		System.out.println("error");
        	}
        }
	}
	
	private boolean fillblannk(char[][]board,int i,int j){
		
		for(char k='1';k<='9';k++){//从1到9进行尝试
			board[i][j]=k;
			if(check(board, i, j)){//检查是否合适,合适的话进行下一个
				//System.out.println("count="+count+" k="+k);
				//System.out.println("count="+count);
				count++;
				//如果count==polist.size();说明前面的全部匹配成功，结束递归，返回true
				if(count == polist.size()){
					return true;
				}
				if(fillblannk(board, polist.get(count).x, polist.get(count).y)){//递归调用
					return true;
				}
				else{//下一项填充不成立
					count--;
				}
			}
			else if(k=='9'){//1到9均不成立，回溯
				board[i][j]='.';//重置该填充位为‘.’;
//				System.out.println("count="+count);
				return false;
			}
		}
		//跳出循环，说明board[i][j]=‘9’满足要求，但其后面的一项不满足要求
		board[i][j]='.';
		return false;
	}
	
	private boolean check(char[][]board,int i,int j){
		
		hashset1.clear();
		hashset2.clear();
		//先行列判断,i是所在行，j是所在列
		for(int p=0;p<9;p++){
			if(hashset1.contains(board[i][p])){//从i行的第一个开始判定
//				System.out.println("hangfalse");
				return false;
			}
			else if(board[i][p]!='.')
				hashset1.add(board[i][p]);
			
			if(hashset2.contains(board[p][j])){//从j列的第一个开始判定
//				System.out.println("lie");
				return false;
			}
			else if(board[p][j]!='.')
				hashset2.add(board[p][j]);
		}
		hashset1.clear();
		hashset2.clear();
		//所在九宫格判断,先确定是哪个九宫格
		if(i>=0&&i<3)
			i=0;
		else if(i>=3&&i<6)
			i=3;
		else
			i=6;
		if(j>=0&&j<3)
			j=0;
		else if(j>=3&&j<6)
			j=3;
		else
			j=6;

		for(int m=i;m<i+3;m++){
			for(int n=j;n<j+3;n++){
				if(hashset1.contains(board[m][n])){
//					System.out.println("九宫格");
					return false;
				}
				else if(board[m][n]!='.')
					hashset1.add(board[m][n]);
			}
		}
		hashset1.clear();
		return true;
	}
}
