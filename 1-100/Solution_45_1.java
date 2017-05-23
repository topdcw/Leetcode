package com.dcw.leetcode;

/**
 * Jump Game II
 * ����̰���㷨
 * ���ȶ���һ����nums������ͬ������flag��
 * ��numsλ��i��ʼ������nums[i]��ֵ����flag�б��flag[i]~flag[i+nums[i]]��ֵΪi��
 * ����¼�����λ��loc
 * ������nums[i+1]���в��������i+1+nums[i+1]<=loc,�Ͳ����б�ǲ����ˡ�
 * ��flag��ȫ�������ɡ��ʹ�flag�������һ��λ��n��������ǰ�ҵ�ǰflag[n]ֵ����λ�ã�����n=flag[n]��
 * ������ǰ���£�ֱ��n==0����¼����
 * ���磺2��3��1��1��4
 * @author topdc
 *
 */
public class Solution_45_1 {
    public int jump(int[] nums) {
    	if(nums.length==0||nums.length==1)
    		return 0;
    	
    	int []flag=new int[nums.length];
    	int loc=0;
    	for(int i=0;i<nums.length-1;i++){
    		//j��loc+1����
    		for(int j=loc+1;j<=nums.length-1&&j<=i+nums[i];j++){//����nums[i]��ֵ���б��
    			if(j>loc){
    				flag[j]=i;
    				loc=j;//����loc
    			}	
    		}
    	}
    	
//    	for (int i : flag) {
//			System.out.println(i);
//		}
    	//�����ɣ����лع飬�����һ������,���ݱ�ǽ����������
    	int count=0;
    	int n=flag.length-1;
    	while(n>0){
    		n=flag[n];
    		count++;
    	}
		return count;
        
    }
    public static void main(String[] args) {
		Solution_45_1 s=new Solution_45_1();
		System.out.println(s.jump(new int[]{2,3,1,1,4}));
	}
}