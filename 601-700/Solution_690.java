import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_690 {
	
	public int getImportance(List<Employee> employees, int id) {
		HashMap<Integer, Employee> data=new HashMap<>();
        for(Employee e:employees)
        	data.put(e.id, e);

        
        ArrayList<Integer> iddata=new ArrayList<>();
        int res=0;
        iddata.add(id);
        while(!iddata.isEmpty()) {
        	res+=data.get(iddata.get(0)).importance;
        	for(Integer e:data.get(iddata.get(0)).subordinates) {
        		iddata.add(e);
        	}
        	iddata.remove(0);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
