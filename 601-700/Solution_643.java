
//���� n ���������ҳ�ƽ��������ҳ���Ϊ k �����������飬����������ƽ������
public class Solution_643 {

	public double findMaxAverage(int[] nums, int k) {
		double max=0;
        double sum=0;
        for(int i=0;i<k;i++) {
        	sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<nums.length;i++) {
        	sum=sum-nums[i-k]+nums[i];
        	max=sum>max?sum:max;
        }
        return max/k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
