package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Keyboard Row
 * 1,比对法
 * 2，hash法
 * 3，素数法
 * 这里采用第二种
 * @author Dong
 *
 */
public class Solution_500 {
	HashSet<Character> row1=new HashSet<Character>();
	HashSet<Character> row2=new HashSet<Character>();
	HashSet<Character> row3=new HashSet<Character>();
	
	public Solution_500() {
		// TODO Auto-generated constructor stub
		row1.add('q');
		row1.add('w');
		row1.add('e');
		row1.add('r');
		row1.add('t');
		row1.add('y');
		row1.add('u');
		row1.add('i');
		row1.add('o');
		row1.add('p');
		row2.add('a');
		row2.add('s');
		row2.add('d');
		row2.add('f');
		row2.add('g');
		row2.add('h');
		row2.add('j');
		row2.add('k');
		row2.add('l');
		row3.add('z');
		row3.add('x');
		row3.add('c');
		row3.add('v');
		row3.add('b');
		row3.add('n');
		row3.add('m');
	}
	public String[] findWords(String[] words) {
		List<String> list=new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String str=words[i].toLowerCase();
			list.add(words[i]);
			if(row1.contains(str.charAt(0))){
				for (int j = 1; j < str.length(); j++) {
					if(!row1.contains(str.charAt(j))){
						list.remove(words[i]);
						break;
					}
				}
			}
			if(row2.contains(str.charAt(0))){
				for (int j = 1; j < str.length(); j++) {
					if(!row2.contains(str.charAt(j))){
						list.remove(words[i]);
						break;
					}
				}
			}
			if(row3.contains(str.charAt(0))){
				for (int j = 1; j < str.length(); j++) {
					if(!row3.contains(str.charAt(j))){
						list.remove(words[i]);
						break;
					}
				}
			}
			
		}
		
		return  list.toArray(new String[0]);
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]str=new String[]{"Hello","Alaska","Dad","Peace"};
		Solution_500 s=new Solution_500();
		for (int i = 0; i < s.findWords(str).length; i++) {
			System.out.println(s.findWords(str)[i]);
		}
	}

}
