import java.util.ArrayList;
import java.util.HashMap;

public class Solution_599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> data1=new HashMap<>();

        ArrayList<String> res=new ArrayList<>();
        int count=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        	data1.put(list1[i], i);
        for(int i=0;i<list2.length;i++) {
        	if(data1.containsKey(list2[i])) {
        		int tmp=i+data1.get(list2[i]);
        		if(tmp<count) {
        			res.clear();
        			res.add(list2[i]);
        			count=tmp;
        		}
        		else if(tmp==count)
        			res.add(list2[i]);
        	}
        }
        
        String[] r=new String[res.size()];
        for(int i=0;i<res.size();i++)
        	r[i]=res.get(i);
        return r;
        
    }
}
