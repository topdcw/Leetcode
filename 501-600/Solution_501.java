import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution_501 {
	HashMap<Integer, Integer> data=new HashMap<>();//遍历过程中记录重复个数
	public int[] findMode(TreeNode root) {
		 if(root==null)
			 return new int[] {};
		 searchTree(root);
		 Integer[]vas=data.values().toArray(new Integer[0]);
		 Arrays.sort(vas);
		 ArrayList<Integer> res=new ArrayList<>();
		 for (Integer integer : data.keySet()) {
			if(data.get(integer).equals(vas[vas.length-1])) {
				res.add(integer);
			}
				
		 }
		 int[]r=new int[res.size()];
		 for(int i=0;i<r.length;i++) {
			 r[i]=res.get(i);
		 }
		 return r;
		 
    }
	
	private void searchTree(TreeNode root) {
		if(data.containsKey(root.val))
			data.put(root.val, data.get(root.val)+1);
		else
			data.put(root.val, 1);
		if(root.left!=null)
			searchTree(root.left);
		if(root.right!=null)
			searchTree(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
