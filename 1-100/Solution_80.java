import java.util.Collection;
import java.util.HashMap;


/**
 * Remove Duplicates from Sorted Array II
 * 对已经排好序的数组进行处理，每个数字最多出现两次。去除多余的重复数字
 *计算返回值的同时需要对原来数组进行修改
 * 方法一：利用hashmap进行辅助计算
 */
public class Solution_80 {
    public int removeDuplicates(int[] nums) {
        //利用hashmap
        int ret=0;
        HashMap<Integer,Integer> data=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(data.containsKey(nums[i])){
                if(data.get(nums[i])<2){
                    data.put(nums[i],2);
                    nums[ret]=nums[i];
                    ret++;
                }
            }
            else{
                data.put(nums[i],1);
                nums[ret]=nums[i];
                ret++;
            }

        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
