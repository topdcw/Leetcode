package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * 3-Fizz
 * 5-Buzz
 * 3ºÍ5µÄ±¶Êý-FizzBuzz
 * @author Dong
 *
 */
public class Solution_412 {

	public List<String> fizzBuzz(int n) {
		List<String> ret =new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if(i%3==0){
				if(i%5==0){
					ret.add("FizzBuzz");
				}
				else{
					ret.add("Fizz");
				}
			}
			else if(i%5==0){
				ret.add("Buzz");
			}
			else{
				ret.add(""+i);
			}
		}
		
		return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
