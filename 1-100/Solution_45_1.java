package com.dcw.leetcode;

/**
 * Jump Game II
 * 采用贪心算法
 * 首先定义一个与nums长度相同的数组flag。
 * 从nums位置i开始，根据nums[i]的值，在flag中标记flag[i]~flag[i+nums[i]]的值为i，
 * 并记录最后标记位置loc
 * 进而对nums[i+1]进行操作，如果i+1+nums[i+1]<=loc,就不进行标记操作了。
 * 等flag中全部标记完成。就从flag数组最后一个位置n出发，向前找当前flag[n]值所在位置，更新n=flag[n]。
 * 依次向前更新，直至n==0，记录步数
 * 例如：2、3、1、1、4
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
    		//j从loc+1出发
    		for(int j=loc+1;j<=nums.length-1&&j<=i+nums[i];j++){//根据nums[i]的值进行标记
    			if(j>loc){
    				flag[j]=i;
    				loc=j;//更新loc
    			}	
    		}
    	}
    	
//    	for (int i : flag) {
//			System.out.println(i);
//		}
    	//标记完成，进行回归，从最后一个出发,根据标记进行逆向查找
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