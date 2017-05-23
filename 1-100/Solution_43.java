package com.dcw.leetcode;

/**
 * Multiply Strings
 * 大数相乘
 * 思路：将大数乘法转化为大数加法
 * @author topdc
 *
 */
public class Solution_43 {
	public String multiply(String num1, String num2) {
		
		if(num1.equals("0")||num2.equals("0"))
			return "0";
		
		//依次计算出来num1*1，num1*2到num*9的值
		String []sinfo = new String[9] ;
		for(int i=0;i<9;i++){
			sinfo[i]="0";
			for(int j=1;j<=i+1;j++){//i=0表示乘以1
				sinfo[i]=add(sinfo[i], num1);
			}
//			System.out.println(i+" "+sinfo[i]);
		}
//		for (String string : sinfo) {
//			System.out.println(string);
//		}
		
		//大数相乘：依次算出num2每一位与num1的乘积，最后相加
		String []result=new String[num2.length()];
		
		for(int i=num2.length()-1,j=0;i>=0;i--,j++){
			switch(num2.charAt(i)){//根据num2的各位进行判断
				case '0': 
					result[j]="0";
					break;	
				case '1':
					result[j]=sinfo[0];
					break;
				case '2':
					result[j]=sinfo[1];
					break;
				case '3':
					result[j]=sinfo[2];
					break;
				case '4':
					result[j]=sinfo[3];
					break;
				case '5':
					result[j]=sinfo[4];
					break;
				case '6':
					result[j]=sinfo[5];
					break;
				case '7':
					result[j]=sinfo[6];
					break;
				case '8':
					result[j]=sinfo[7];
					break;
				case '9':
					result[j]=sinfo[8];
					break;
			}
		}
		//补位操作,补0
		for(int i=0;i<num2.length();i++){
			for(int j=1;j<=i;j++){
				result[i]+='0';
			}
		}
		
		//求结果
		String ret="0";
		for(int i=0;i<num2.length();i++){
			ret=add(ret, result[i]);
		}
		return ret;
    }
	
	
	
	//大数加法
	public String add(String s1,String s2){
		StringBuilder res=new StringBuilder();//正式结果
		StringBuilder ret=new StringBuilder();//翻转的结果
		StringBuilder n1=new StringBuilder();
		StringBuilder n2=new StringBuilder();
		
		
		//先将s1,s2反转，方便计算
		for(int i=s1.length()-1;i>=0;i--){
			n1.append(s1.charAt(i));
		}
		for(int i=s2.length()-1;i>=0;i--){
			n2.append(s2.charAt(i));
		}
		
		//通过补0将两个数的位数弄相同
		if(s1.length()>s2.length()){
			for(int i=s1.length()-s2.length();i>0;i--){
				n2.append(0);
			}
		}
		else{
			for(int i=s2.length()-s1.length();i>0;i--){
				n1.append(0);
			}
		}

		//执行加法
		int c=0;//表示进位
		for(int i=0;i<n1.length();i++){
			int n =c+n1.charAt(i)-'0'+n2.charAt(i)-'0';
			c=0;//用完之后置零
			if(n-10>=0){//需要进位
				c=1;
				ret.append(n-10);
			}
			else{
				ret.append(n);
			}
		}
		if(c>0)//最高位后还有进位
			ret.append(c);
		

		//翻转回来
		for(int i=ret.length()-1;i>=0;i--){
			res.append(ret.charAt(i));
		}
		
		return res.toString();
		
		
		
	}
}
