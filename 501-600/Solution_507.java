import java.util.ArrayList;

public class Solution_507 {
	//对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
	//先找正因子，再去判断
	
	 public boolean checkPerfectNumber(int num) {
	        if(num==1)
	            return false;
	        int mid=(int)Math.sqrt(num);
	        ArrayList<Integer> data=new ArrayList<>();
	        data.add(1);
	        for(int i=2;i<=mid;i++) {
	        	if(num%i==0) {
	        		data.add(i);
	        		data.add(num/i);
	        	}		
	        }
	        int res=0;
	        for(Integer i:data) {
	        	res+=i;
	        }
	        return res==num;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
