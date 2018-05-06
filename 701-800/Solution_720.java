package top.guenon;

import java.util.HashMap;
import java.util.TreeMap;

public class Solution_720 {
	public String longestWord(String[] words) {
        int max=0;
        HashMap<String, Integer> data=new HashMap<>();//值为0说明之前被判断过
        TreeMap<String, Integer> res=new TreeMap<>();
        for(String s:words)
        	data.put(s, 1);
        for(String s:words) {
        	if(s.length()<max||data.get(s)==0) {
        		data.put(s, 0);
        		continue;
        	}
        		
        	else {
        		int n=1;
        		for(int i=s.length()-1;i>0;i--) {
        			String tmp=s.substring(0, i);
        			if(data.containsKey(tmp)) {
        				data.put(tmp, 0);
        				n++;
        			}
        			else {
        				break;
        			}
        		}
        		if(n==s.length()) {
        			if(n>max) {
        				max=n;
        				res.clear();
        				res.put(s, max);
        			}
        			else {
        				res.put(s, max);
        			}
        		}			
        	}   	
        }
        return res.firstKey();
        
        
    }
}
