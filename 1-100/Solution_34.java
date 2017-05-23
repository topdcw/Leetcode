package com.dcw.leetcode;

/**
 * Search for a Range
 * Ҫ��O(logN)
 * ˼·�����ַ�,���ҵ�һ�����ϵģ���ȥ����������Χ��begin��end
 * @author topdc
 *
 */
public class Solution_34 {
	public int[] searchRange(int[] nums, int target) {
		int lo1,lo2;
		int hi1,hi2;
		int index=-1;
		lo1=0;
		hi1=nums.length-1;
		
		//������һ�ζ��֣����ܲ����ҵ�target������¼�ҵ���λ��
        while(lo1<=hi1){
        	int mid=(lo1+hi1)/2;
        	if(nums[mid]>target)
        		hi1=mid-1;
        	else if(nums[mid]<target)
        		lo1=mid+1;
        	else{
        		index=mid;
        		break;//�ҵ�һ���ͺ�
        	}
        }
        if(index==-1){//û�ҵ�target,ֱ�ӷ���
            return new int[]{-1,-1};
        }
        int begin,end;
        begin=end=index;
        //����index���������֣�lo1��index-1��index+1��hi1.����ʹ�ö��ַ�
        lo2=index+1;
        hi2=hi1;//��hi2��ʾhi1��λ��
        hi1=index-1;
		//lo1��index-1֮��Ĵ���,��Ϊ���������У�����ҪôС��targetҪô����target
        while(lo1<=hi1){
        	int mid =(lo1+hi1)/2;
        	if(nums[mid]<target)
        		lo1=mid+1;
        	else{
        		begin=mid;
        		hi1=mid-1;//��������Ѱ��
        	}
        }
        //index+1��hi2֮��Ĵ���,��Ϊ���������У�����Ҫô������targetҪô����target
        while(lo2<=hi2){
        	int mid =(lo2+hi2)/2;
        	if(nums[mid]>target)
        		hi2=mid-1;
        	else{
        		end=mid;
        		lo2=mid+1;//��������Ѱ��
        	}
        }
        return new int[]{begin,end};
    }
	
}
