package com.dcw.leetcode;
/**
 * Valid Number
 * 判断是不是有效数字
 * 特别麻烦，注意细节
 * @author topdc
 *
 */
public class Solution_65 {

	public boolean isNumber(String s) {
		s=s.trim();
		if(s.length()==0)
			return false;
		if(s.length()==1){//如果只有一位，只能是数字
			if(s.charAt(0)-'0'<0||s.charAt(0)-'0'>9)
				return false;
			else
				return true;
		}
		
		boolean ret=true;
		int dianflag=0;
		int eflag=0;
		int loc=0;//当前位置
		
		int num=s.charAt(loc)-'0';
		if(num<0||num>9){//第一位是不是+或者.
			if(num+'0'=='+'||num+'0'=='-'){
				loc++;//如果第一位是+或者-，loc就+1
			}		
		}
		num=s.charAt(loc)-'0';//判断第一位或者第二位是不是点
		if(num<0||num>9){
			if(num+'0'!='.')
				return false;
			else{
				dianflag=1;//说明第一个是点
				loc++;
				if(loc==s.length())
					return false;
			}
		}
		num=s.charAt(loc)-'0';
		if(dianflag==1){
			if(num+'0'=='e')//开头时点和e不同时出现
				return false;
		}
		while(loc<s.length()&&num>=0&&num<=9){//判断是不是数字
			loc++;
			if(loc<s.length())
				num=s.charAt(loc)-'0';
		}
		
		if(loc<s.length()){//e和点的判断
			if(s.charAt(loc)!='e'&&s.charAt(loc)!='.'){//不是e或者.
				return false;
			}
			
			else{//是点或者是e
				if(s.charAt(loc)=='.'){//点是否重复出现
					if(dianflag==1)
						return false;
					else{
						loc++;
						dianflag=1;
						if(loc==s.length())//数字后跟着一个点可以
							return true;
					}
				}
				else{			//是e
					eflag=1;
					loc++;
					if(loc==s.length())
						return false;
					else
						num=s.charAt(loc)-'0';
				}
			}
			
			num=s.charAt(loc)-'0';
			if(eflag==0&&num+'0'=='e'){
				loc++;
				eflag=1;
				if(loc==s.length())
					return false;
			}
			num=s.charAt(loc)-'0';
			if(num+'0'=='+'||num+'0'=='-'){
				if(eflag==1){
					loc++;
					if(loc==s.length())
						return false;
				}
				else
					return false;
			}
			
			num=s.charAt(loc)-'0';
			while(loc<s.length()&&num>=0&&num<=9){//判断是不是数字
				loc++;
				if(loc<s.length())
					num=s.charAt(loc)-'0';
			}
			System.out.println(loc);
			if(loc<s.length()){
				if(num+'0'!='.'&&num+'0'!='e')
					return false;
				else{
					if(num+'0'=='.'){
						if(dianflag==1||eflag==1)
							return false;
						else{
							loc++;
							if(loc==s.length())
								return false;
						}
					}
					if(num+'0'=='e'){
						if(eflag==1)
							return false;
						else{
							loc++;
							eflag=1;
							if(loc==s.length())
								return false;
						}
					}
				}		
			}
			else
				return true;
			System.out.println(loc);
			num=s.charAt(loc)-'0';
			if(num+'0'=='+'||num+'0'=='-'){
				if(eflag==1){
					loc++;
					if(loc==s.length())
						return false;
				}
				else
					return false;
			}
			num=s.charAt(loc)-'0';
			while(loc<s.length()&&num>=0&&num<=9){
				loc++;
				if(loc<s.length())
					num=s.charAt(loc)-'0';
			}
			if(loc<s.length())
				return false;
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_65 s=new Solution_65();
		System.out.println(s.isNumber("1.38354e+8"));
	}

}
