import java.util.HashSet;

public class Solution_653 {
	HashSet<Integer> data=new HashSet<>();
	public boolean findTarget(TreeNode root, int k) {
		if(root==null)
			return false;
		search(root);
		for(Integer i:data) {
			if(k-i==i)
				continue;
			if(data.contains(k-i))
				return true;
		}
		return false;
        
    }
	
	private void search(TreeNode root) {
		if(root.left!=null)
			search(root.left);
		data.add(root.val);
		if(root.right!=null)
			search(root.right);
		
	}
}
