
public class Solution_693 {
	public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++) {
        	if(s.charAt(i)==s.charAt(i+1))
        		return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
