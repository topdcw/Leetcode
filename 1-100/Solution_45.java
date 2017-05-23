package com.dcw.leetcode;

/**
 * Jump Game II
 *���ö�̬�滮----�ᳬʱ
 *��������jumpLength��jumpLength[i]��ʾ�ӵ�i��λ�õ����һ��λ��������С����
 *��Ŀ������Ϊtarget�����target-1��ǰ����
 *���磺2��3��1��1��4
 * @author topdc
 *
 */
public class Solution_45 {
	public int count=0;
	public int jump(int[] nums) {
		int target=nums.length-1;//Ŀ��λ�õ�����
		int []jumpLength=new int[nums.length];
		jumpLength[target]=0;
		for(int i=target-1;i>=0;i--){
			//s.jump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0});
			//����jumpLength[i]
			jumpLength[i]=-1;//��ʼΪ-1
			int min=2147483647;
			for(int j=1;j<=nums[i]&&i+j<=target;j++){
				count++;
				if(jumpLength[i+j]!=-1&&jumpLength[i+j]<min)
					min=jumpLength[i+j];
			}
			if(min!=2147483647)
				jumpLength[i]=1+min;
		}
		for (int i : jumpLength) {
			System.out.println(i);
		}
		return jumpLength[0];
        
    }
}
