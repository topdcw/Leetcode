import java.util.TreeMap;

public class Solution_532 {
	
	public int findPairs(int[] nums, int k) {
		if(k<0)
			return 0;
        TreeMap<Integer, Integer> data=new TreeMap<>();//保证了键值按升序排列
        for(int i=0;i<nums.length;i++) {
        	if(data.containsKey(nums[i]))
        		data.put(nums[i], data.get(nums[i])+1);
        	else
        		data.put(nums[i], 1);
        }
        int res=0;
        for(Integer i:data.keySet()) {
        	if(data.containsKey(i+k)) {
        		if(k==0) {
        			if(data.get(i)>=2)
        				res++;
        		}
        		else
        			res++;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
