
public class Solution_671 {
	int min=0;
	int Secondmin=0;
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
        	return -1;
		min=root.val;
		Secondmin=root.val;
		search(root);
		if(min!=Secondmin)
			return Secondmin;
		
		return -1;
    }
	public void search(TreeNode root) {
		if(min<root.val) {
			if(Secondmin==min)
				Secondmin=root.val;
			else if(root.val<Secondmin)
				Secondmin=root.val;
		}
		if(root.left!=null) {
			search(root.left);
			search(root.right);
		}
		
	}
}
