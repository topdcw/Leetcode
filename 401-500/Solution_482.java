
public class Solution_482 {

	public String licenseKeyFormatting(String S, int K) {
		String[] data=S.toUpperCase().split("-");
		StringBuilder sb=new StringBuilder();
		for (String string : data) {
			sb.append(string);
		}
		StringBuilder res=new StringBuilder();
		for(int i=sb.length();i>0;i-=K) {
			if(i-K>0)
				res.insert(0, "-"+sb.subSequence(i-K, i));
			else
				res.insert(0, sb.subSequence(0, i));
		}
		
		
		return res.toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_482 s=new Solution_482();
		System.out.println(s.licenseKeyFormatting("2-5g-3-J", 2));
	}

}
