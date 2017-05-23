package com.dcw.leetcode;

/**
 * Multiply Strings
 * �������
 * ˼·���������˷�ת��Ϊ�����ӷ�
 * @author topdc
 *
 */
public class Solution_43 {
	public String multiply(String num1, String num2) {
		
		if(num1.equals("0")||num2.equals("0"))
			return "0";
		
		//���μ������num1*1��num1*2��num*9��ֵ
		String []sinfo = new String[9] ;
		for(int i=0;i<9;i++){
			sinfo[i]="0";
			for(int j=1;j<=i+1;j++){//i=0��ʾ����1
				sinfo[i]=add(sinfo[i], num1);
			}
//			System.out.println(i+" "+sinfo[i]);
		}
//		for (String string : sinfo) {
//			System.out.println(string);
//		}
		
		//������ˣ��������num2ÿһλ��num1�ĳ˻���������
		String []result=new String[num2.length()];
		
		for(int i=num2.length()-1,j=0;i>=0;i--,j++){
			switch(num2.charAt(i)){//����num2�ĸ�λ�����ж�
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
		//��λ����,��0
		for(int i=0;i<num2.length();i++){
			for(int j=1;j<=i;j++){
				result[i]+='0';
			}
		}
		
		//����
		String ret="0";
		for(int i=0;i<num2.length();i++){
			ret=add(ret, result[i]);
		}
		return ret;
    }
	
	
	
	//�����ӷ�
	public String add(String s1,String s2){
		StringBuilder res=new StringBuilder();//��ʽ���
		StringBuilder ret=new StringBuilder();//��ת�Ľ��
		StringBuilder n1=new StringBuilder();
		StringBuilder n2=new StringBuilder();
		
		
		//�Ƚ�s1,s2��ת���������
		for(int i=s1.length()-1;i>=0;i--){
			n1.append(s1.charAt(i));
		}
		for(int i=s2.length()-1;i>=0;i--){
			n2.append(s2.charAt(i));
		}
		
		//ͨ����0����������λ��Ū��ͬ
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

		//ִ�мӷ�
		int c=0;//��ʾ��λ
		for(int i=0;i<n1.length();i++){
			int n =c+n1.charAt(i)-'0'+n2.charAt(i)-'0';
			c=0;//����֮������
			if(n-10>=0){//��Ҫ��λ
				c=1;
				ret.append(n-10);
			}
			else{
				ret.append(n);
			}
		}
		if(c>0)//���λ���н�λ
			ret.append(c);
		

		//��ת����
		for(int i=ret.length()-1;i>=0;i--){
			res.append(ret.charAt(i));
		}
		
		return res.toString();
		
		
		
	}
}
