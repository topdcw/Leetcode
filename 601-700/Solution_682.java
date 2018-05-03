import java.util.ArrayList;

public class Solution_682 {
	public int calPoints(String[] ops) {
        ArrayList<Integer> counts=new ArrayList<>();
        for(int i=0;i<ops.length;i++) {
        	if(Character.isDigit(ops[i].charAt(ops[i].length()-1))) {
        		counts.add(Integer.parseInt(ops[i]));
        	}
        	else
        	if(ops[i].charAt(0)=='+') {
        		counts.add(counts.get(counts.size()-1)+counts.get(counts.size()-2));
        	}
        	else
        	if(ops[i].charAt(0)=='D') {
        		counts.add(counts.get(counts.size()-1)*2);
        	}
        	else
        	if(ops[i].charAt(0)=='C') {
        		counts.remove(counts.size()-1);
        		
        	}
        }
        int res=0;
        for(int i:counts) {
        	res+=i;
        }
        return res;
    }
}
