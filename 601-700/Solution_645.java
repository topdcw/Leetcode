import java.util.ArrayList;

public class Solution_645 {
	public int[] findErrorNums(int[] nums) {
		
		int []res=new int[2];
		int []orderedNums=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	if(orderedNums[nums[i]-1]==1) {//˵�����ظ�Ԫ��
        		res[0]=nums[i];
        	}
        	else {
        		orderedNums[nums[i]-1]=1;
        	}
        }
        for(int i=0;i<orderedNums.length;i++) {
        	if(orderedNums[i]==0) {//˵����Ԫ��ȱʧ
        		res[1]=i+1;
        	}
        }
        return res;
    }
}
