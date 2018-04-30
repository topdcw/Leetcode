//最短无序子字符串

public class Solution_581 {
	public int findUnsortedSubarray(int[] nums) {
        //先知道end，再找from
		int end=nums.length-1;
		int from=0;
		while(end>=from&&checkMax(nums, from, end)) {
			end--;
		}
		while(end>=from&&checkMin(nums, from, end)) {
			from++;
		}
		return end-from+1;
    }
	
	public boolean checkMax(int[] nums,int from ,int end) {
		int num=nums[end];
		for(int i=end-1;i>=from;i--) {
			if(nums[i]>num)
				return false;
		}
		return true;
		
	}
	public boolean checkMin(int[] nums,int from ,int end){
		
		int num=nums[from];
		for(int i=from+1;i<=end;i++) {
			if(nums[i]<num)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution_581 s=new Solution_581();
		System.out.println(s.findUnsortedSubarray(new int[] {1,2,3,4}));
	}
}


//× 关闭
//执行用时为 17 ms 的范例
//class Solution {
//    public int findUnsortedSubarray(int[] nums) {
//        int start = 0;
//        int end = 0;
//        int max = nums[0];
//        //正向找end
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] > max){
//                max = nums[i];
//            }
//            if(nums[i] < nums[i-1] ){
//                end = i ;
//            }
//            if(nums[i] < max){
//                    end = i;
//            }
//        }
//        //逆向找start
//        int min = nums[nums.length-1];
//        for(int i=nums.length-1;i>=0;i--){
//            if(nums[i] < min){
//                    min = nums[i];
//            }
//            if(i!=0 && nums[i] < nums[i-1] ){
//                start = i ;
//            }
//            if(nums[i] > min){
//                    start = i ;
//            }
//        }
//        return end==0?0:end - start + 1 ;
//    }
//}