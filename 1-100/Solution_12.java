package com.dcw.leetcode;

public class Solution_12 {
	/**
	 * Integer to Roman
	 * 
	 *I = 1;
	 *V = 5;
	 *X = 10;
	 *L = 50;
	 *C = 100;
	 *D = 500;
	 *M = 1000;
	 *科普网址http://www.cnblogs.com/glorywu/p/5256968.html
	 */
	public String intToRoman(int num) {
		
		//共有13种可能性"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
		//依次对应：1000、900、500、400、100、90、50、40、10、9、5、4、1
		//递归调用实现
		
		if(num>=1000)
			return "M"+intToRoman(num-1000);
		if(num>=900)
			return "CM"+intToRoman(num-900);
		if(num>=500)
			return "D"+intToRoman(num-500);
		if(num>=400)
			return "CD"+intToRoman(num-400);
		if(num>=100)
			return "C"+intToRoman(num-100);
		if(num>=90)
			return "XC"+intToRoman(num-90);
		if(num>=50)
			return "L"+intToRoman(num-50);
		if(num>=40)
			return "XL"+intToRoman(num-40);
		if(num>=10)
			return "X"+intToRoman(num-10);
		if(num>=9)
			return "IX"+intToRoman(num-9);
		if(num>=5)
			return "V"+intToRoman(num-5);
		if(num>=4)
			return "IV"+intToRoman(num-4);
		if(num>=1)
			return "I"+intToRoman(num-1);
		
		return "";
    }
}
