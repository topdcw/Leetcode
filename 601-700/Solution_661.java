
public class Solution_661 {
	public int[][] imageSmoother(int[][] M) {
		if(M.length==0)
			return null;
		int m=M.length;
		int n=M[0].length;
        int [][]res=new int[m][n];
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		int ns=1;//周围元素及该元素总个数
        		int sum=M[i][j];//周围元素及该元素的和
        		//8个边缘判断
        		if((i-1)>=0&&(j-1)>=0) {//左上角
        			ns++;
        			sum+=M[i-1][j-1];
        		}
        		
        		if((i)>=0&&(j-1)>=0) {//左侧
        			ns++;
        			sum+=M[i][j-1];
        		}
        		
        		if((i+1)<m&&(j-1)>=0) {//左下角
        			ns++;
        			sum+=M[i+1][j-1];
        		}
        		
        		if((i+1)<m&&(j)>=0) {//下
        			ns++;
        			sum+=M[i+1][j];
        		}
        		
        		if((i+1)<m&&(j+1)<n) {//右下
        			ns++;
        			sum+=M[i+1][j+1];
        		}
        		
        		if((i)>=0&&(j+1)<n) {//右侧
        			ns++;
        			sum+=M[i][j+1];
        		}
        		if((i-1)>=0&&(j+1)<n) {//右上角
        			ns++;
        			sum+=M[i-1][j+1];
        		}
        		if((i-1)>=0&&(j)>=0) {//上侧
        			ns++;
        			sum+=M[i-1][j];
        		}
        		
        		res[i][j]=sum/ns;
        		
        	}
        }
        return res;
    }
}
