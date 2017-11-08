/**
 * Search in Rotated Sorted Array II
 */
public class Solution_81 {
    public boolean search(int[] nums, int target) {
        if(nums.length==0)
            return false;
        //先寻找旋转点(最小的那个点)，再使用二分排序
        int lo=0;
        int hi=nums.length-1;
        int len=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==nums[len]){
                len--;
                hi=len;
            }
            else
            if(nums[mid]<=nums[hi]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        int rot=lo;
        if(nums[len]>=target){//在rot和len之间寻找
            lo=rot;
            hi=len;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(nums[mid]==target)
                    return true;
                else if (nums[mid]>target)
                        hi=mid-1;
                else
                    lo=mid+1;
            }
        }
        else {
            lo=0;
            hi=rot-1;
            while (lo<=hi){
                int mid=(lo+hi)/2;
                if(nums[mid]==target)
                    return true;
                else if (nums[mid]>target)
                    hi=mid-1;
                else
                    lo=mid+1;
            }
        }
        return false;
    }
}
