package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Add Strings
 * The length of both num1 and num2 is < 5100.
 * 大数加法的实现
 * @author topdc
 *
 */
public class Solution_415 {

	public String addStrings(String num1, String num2) {
		List<Integer>list=new ArrayList<>();
        //使num1长度>=num2
		if(num1.length()<num2.length()){
			String tmp=num1;
			num1=num2;
			num2=tmp;
		}
		int c=0;
		int i=num1.length()-1,j=num2.length()-1;
		while(j>=0){
			int r=num1.charAt(i--)-'0'+num2.charAt(j--)-'0'+c;
			c=r/10;
			list.add(r%10);
		}
		while(i>=0){
			int r=num1.charAt(i--)-'0'+c;
			c=r/10;
			list.add(r%10);
		}
		if(c>0)
			list.add(c);
		StringBuilder ret=new StringBuilder();
		for (int k = list.size()-1; k >=0; k--) {
			ret.append(list.get(k));
		}
		return ret.toString();
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
