
public class Solution_661 {
	public int[][] imageSmoother(int[][] M) {
		if(M.length==0)
			return null;
		int m=M.length;
		int n=M[0].length;
        int [][]res=new int[m][n];
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		int ns=1;//��ΧԪ�ؼ���Ԫ���ܸ���
        		int sum=M[i][j];//��ΧԪ�ؼ���Ԫ�صĺ�
        		//8����Ե�ж�
        		if((i-1)>=0&&(j-1)>=0) {//���Ͻ�
        			ns++;
        			sum+=M[i-1][j-1];
        		}
        		
        		if((i)>=0&&(j-1)>=0) {//���
        			ns++;
        			sum+=M[i][j-1];
        		}
        		
        		if((i+1)<m&&(j-1)>=0) {//���½�
        			ns++;
        			sum+=M[i+1][j-1];
        		}
        		
        		if((i+1)<m&&(j)>=0) {//��
        			ns++;
        			sum+=M[i+1][j];
        		}
        		
        		if((i+1)<m&&(j+1)<n) {//����
        			ns++;
        			sum+=M[i+1][j+1];
        		}
        		
        		if((i)>=0&&(j+1)<n) {//�Ҳ�
        			ns++;
        			sum+=M[i][j+1];
        		}
        		if((i-1)>=0&&(j+1)<n) {//���Ͻ�
        			ns++;
        			sum+=M[i-1][j+1];
        		}
        		if((i-1)>=0&&(j)>=0) {//�ϲ�
        			ns++;
        			sum+=M[i-1][j];
        		}
        		
        		res[i][j]=sum/ns;
        		
        	}
        }
        return res;
    }
}
