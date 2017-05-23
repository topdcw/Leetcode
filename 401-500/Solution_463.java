package com.dcw.leetcode;

/**
 * Island Perimeter
 * 检测每一个1的右侧、下侧是否有1.注意特殊位置点的判断
 * @author Dong
 *
 */
public class Solution_463 {

	public int islandPerimeter(int[][] grid) {
		int repeatNum=0;//表示重合的边数
		int totalCells=0;
		for (int i = 0; i < grid.length; i++) {
			for(int j=0;j<grid[i].length;j++){//右下
				if(grid[i][j]==1){
					totalCells++;
					if(j<grid[i].length-1&&grid[i][j+1]==1)//右
						repeatNum+=1;
					if(i<grid.length-1&&grid[i+1][j]==1)//下
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
