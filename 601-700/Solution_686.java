
public class Solution_686 {
	public int repeatedStringMatch(String A, String B) {
		if(A.length()>=B.length()) {
			if(A.contains(B))
				return 1;
			else
				if((A+A).contains(B))
					return 2;
				else
					return -1;
		}
		else {
			//max需要满足：(max-1)*A.length()>=B.length()   max需要向上取整
			int max=(B.length()-1)/A.length()+2;
			
			StringBuilder tmp=new StringBuilder();
			for(int i=0;i<max-1;i++) {
				tmp.append(A);
			}
			if(tmp.toString().contains(B))
				return max-1;
			else if(tmp.append(A).toString().contains(B))
					return max;
				else
					return -1;
		}
        
    }
}
