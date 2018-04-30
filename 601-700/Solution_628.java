import java.util.Arrays;

//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
public class Solution_628 {
	public int maximumProduct(int[] nums) {
		int funum=0;
		int zhengnum=0;
		int Zeropos=-1;//0的位置
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0)
				funum++;
			else if(nums[i]==0)
				Zeropos=i;
			else
				zhengnum++;
		}
		if(zhengnum==0) {
			if(Zeropos!=-1)
				return 0;
			else
				return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		}
		else if(zhengnum==1) {
				if(funum>=2)
					return nums[0]*nums[1]*nums[nums.length-1];
				else
					return 0;
			}
		else if(zhengnum==2) {
				if(Zeropos!=-1)
					return 0;
				else {
					if(funum==1) {
						return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
					}
					else if(funum==2) {
						int tmp1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
						int tmp2=nums[nums.length-2]*nums[nums.length-3]*nums[nums.length-4];
						return tmp1>tmp2?tmp1:tmp2;
					}
					else {
						int tmp1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
						int tmp2=nums[nums.length-2]*nums[nums.length-3]*nums[nums.length-4];
						int tmp3=nums[nums.length-3]*nums[nums.length-4]*nums[nums.length-5];
						int tmp4=tmp1>tmp2?tmp1:tmp2;
						return tmp3>tmp4?tmp3:tmp4;
					}
				}	
			}
		else {
			if(funum>=2) {
				int tmp1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
				int tmp2=nums[nums.length-1]*nums[0]*nums[1];
				return tmp1>tmp2?tmp1:tmp2;
			}
			else
				return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		}
        
    }
}
