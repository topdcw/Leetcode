import java.util.ArrayList;
import java.util.List;

public class Solution_728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		ArrayList<Integer> res=new ArrayList<>();
        int tmp=0;
        while(left<=right) {
        	tmp=left;
        	while(tmp!=0) {
        		int k=tmp%10;
        		if(k==0||left%k!=0) {
        			break;
        		}
        		else 
        			tmp/=10;
        	}
            if(tmp==0)
            	res.add(left);
            left++;
        }
        return res;
    }
	public static void main(String[] args) {
		Solution_728 s=new Solution_728();
		List l=s.selfDividingNumbers(1, 22);
	}
}
