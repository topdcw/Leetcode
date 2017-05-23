package com.dcw.leetcode;

/**
 * Island Perimeter
 * ���ÿһ��1���Ҳࡢ�²��Ƿ���1.ע������λ�õ���ж�
 * @author Dong
 *
 */
public class Solution_463 {

	public int islandPerimeter(int[][] grid) {
		int repeatNum=0;//��ʾ�غϵı���
		int totalCells=0;
		for (int i = 0; i < grid.length; i++) {
			for(int j=0;j<grid[i].length;j++){//����
				if(grid[i][j]==1){
					totalCells++;
					if(j<grid[i].length-1&&grid[i][j+1]==1)//��
						repeatNum+=1;
					if(i<grid.length-1&&grid[i+1][j]==1)//��
						repeatNum+=1;
				}
			}
		}
		
        return totalCells*4-repeatNum*2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
