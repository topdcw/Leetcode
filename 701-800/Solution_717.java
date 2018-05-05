package top.guenon;

public class Solution_717 {
	public boolean isOneBitCharacter(int[] bits) {
		int i=0;
        while(i<bits.length) {
        	if(bits[i]==1) {
        		i+=2;
        		if(i==bits.length)
        			return false;
        	}
        		
        	else {
        		i+=1;
        		if(i==bits.length)
        			return true;
        	}
        }
		return false;
    }
}
