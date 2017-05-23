package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Valid Sudoku
 * ˼·����ÿһ�У�ÿһ�п��Ƿ����㡣�ٰ�9���Ź�����в鿴�жϡ�
 * ʹ����hashset�ӿ��ж��ٶ�
 * 
 * @author topdc
 *
 */
public class Solution_36 {
	private HashSet<Character> hashset =new HashSet<Character>();
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> hashset1 =new HashSet<Character>();//����Ƚ�
		HashSet<Character> hashset2 =new HashSet<Character>();//����
		//�����ж�
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				//���ж�
				if(hashset1.contains(board[i][j])){
					return false;//�����ظ�,����������Ҫ��
				}
				else if(board[i][j]!='.'){
					hashset1.add(board[i][j]);//���ǡ�.���ַ���ӽ�set1��
				}
				//���ж�
				if(hashset2.contains(board[j][i])){
					return false;//�����ظ�,����������Ҫ��
				}
				else if(board[j][i]!='.'){
					hashset2.add(board[j][i]);//���ǡ�.���ַ���ӽ�set2��
				}
			}
			hashset1.clear();//������һ�к�������
			hashset2.clear();//������һ�к�������
		}
		
		//�Ź����ж�
		for(int i=0;i<9;i+=3){
			for(int j=0;j<9;j+=3){
				if(!NineJudge(board,i,j)){//���������false
					return false;
				}
			}
		}
		return true;
    }
	
	//һ���Ź����жϺ���
	private boolean NineJudge(char[][] board,int hang,int lie){
		for(int i=hang;i<hang+3;i++){
			for(int j=lie;j<lie+3;j++){
				if(hashset.contains(board[i][j])){
					return false;//�����ظ�,����������Ҫ��
				}
				else if(board[i][j]!='.'){
					hashset.add(board[i][j]);//���ǡ�.���ַ���ӽ�set1��
				}
			}
		}
		hashset.clear();//��գ������´�ʹ��
		return true;
	}
}
