package top.guenon;

import java.util.ArrayList;

public class Solution_821 {

	public int[] shortestToChar(String S, char C) {
		int []res=new int[S.length()];
		ArrayList<Integer> data=new ArrayList<>();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==C)
				data.add(i);
		}
		int min=0;
		for(int i=0;i<S.length();i++) {
			min=Integer.MAX_VALUE;
			for(int j:data) {
				int tmp=Math.abs(j-i);
				if(tmp<min)
					min=tmp;
			}
			res[i]=min;
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
