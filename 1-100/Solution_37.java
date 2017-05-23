package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Sudoku Solver
 * ����һ��δ��ɵ������������һ������������
 * ˼·��һ��һ���յ��ж���䣬ÿ��һ���������ڸ��к͸��У����������ڵ�С�Ź����Ƿ�correct
 * ���ɹ����ͻ���
 * ���õݹ飬���ݣ���һ���ȷ�����ص���һ���У��޸�k�󣬼��������ж���ֱ���ɹ���
 * @author topdc
 *
 */
public class Solution_37 {
	HashSet<Character> hashset1=new HashSet<Character>();
	HashSet<Character> hashset2=new HashSet<Character>();
	ArrayList<position> polist= new ArrayList<position>();
	int count=0;//���ڼ�¼����ʱ�ڼ�����λ��
	
	//�ڲ��࣬���ڼ�¼�յ�λ��
	public class position{
		public int x;
		public int y;
		public position(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	public void solveSudoku(char[][] board) {
		//�Ȳ��ҿ�λ������polist��
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j]=='.')//�ҵ���λ
        			polist.add(new position(i, j));
        	}
        }
//        System.out.println(polist.size());
        //���ݷ����
        if(polist.size()==0)
        	return;
        else{
        	if(!fillblannk(board, polist.get(count).x, polist.get(count).y)){
        		System.out.println("error");
        	}
        }
	}
	
	private boolean fillblannk(char[][]board,int i,int j){
		
		for(char k='1';k<='9';k++){//��1��9���г���
			board[i][j]=k;
			if(check(board, i, j)){//����Ƿ����,���ʵĻ�������һ��
				//System.out.println("count="+count+" k="+k);
				//System.out.println("count="+count);
				count++;
				//���count==polist.size();˵��ǰ���ȫ��ƥ��ɹ��������ݹ飬����true
				if(count == polist.size()){
					return true;
				}
				if(fillblannk(board, polist.get(count).x, polist.get(count).y)){//�ݹ����
					return true;
				}
				else{//��һ����䲻����
					count--;
				}
			}
			else if(k=='9'){//1��9��������������
				board[i][j]='.';//���ø����λΪ��.��;
//				System.out.println("count="+count);
				return false;
			}
		}
		//����ѭ����˵��board[i][j]=��9������Ҫ�󣬵�������һ�����Ҫ��
		board[i][j]='.';
		return false;
	}
	
	private boolean check(char[][]board,int i,int j){
		
		hashset1.clear();
		hashset2.clear();
		//�������ж�,i�������У�j��������
		for(int p=0;p<9;p++){
			if(hashset1.contains(board[i][p])){//��i�еĵ�һ����ʼ�ж�
//				System.out.println("hangfalse");
				return false;
			}
			else if(board[i][p]!='.')
				hashset1.add(board[i][p]);
			
			if(hashset2.contains(board[p][j])){//��j�еĵ�һ����ʼ�ж�
//				System.out.println("lie");
				return false;
			}
			else if(board[p][j]!='.')
				hashset2.add(board[p][j]);
		}
		hashset1.clear();
		hashset2.clear();
		//���ھŹ����ж�,��ȷ�����ĸ��Ź���
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
//					System.out.println("�Ź���");
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
