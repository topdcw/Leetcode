import java.util.HashMap;

public class Solution_724 {
	public int pivotIndex(int[] nums) {
		if(nums.length==0)
			return -1;
		HashMap<Integer,Integer> left=new HashMap<>();
		HashMap<Integer,Integer> right=new HashMap<>();
		int leftsum=0;
		int rightsum=0;
		for(int i=0,j=nums.length-1;i<nums.length;i++,j--) {
			leftsum+=nums[i];
			rightsum+=nums[j];
			left.put(i, leftsum);
			right.put(j, rightsum);
		}
		System.out.println(left.get(9238));
		System.out.println(right.get(9238));
		
		for(int i=0;i<nums.length;i++) {
			if(left.get(i).equals(right.get(i)))
				return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		Solution_724 s=new Solution_724();
		
	}
}
