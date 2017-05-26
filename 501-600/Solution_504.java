package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Base 7
 * 转化为7进制数字,使用取余数算法
 * @author topdc
 *
 */
public class Solution_504 {
	public String convertToBase7(int num) {
		if(num==0)
			return "0";
		List<Integer> list=new ArrayList<>();
        StringBuilder ret=new StringBuilder();
        int sign=num>0?1:-1;
        num=num>0?num:-num;
        while(num>0){
            list.add(num%7);
            num/=7;
        }
        if(sign==-1)
        	ret.append('-');
        for (int i = list.size()-1; i >=0; i--) {
        	ret.append(list.get(i));
    	}
        
        return ret.toString();
    }
}
