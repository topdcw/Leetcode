package com.dcw.leetcode;
/**
 * Valid Number
 * �ж��ǲ�����Ч����
 * �ر��鷳��ע��ϸ��
 * @author topdc
 *
 */
public class Solution_65 {

	public boolean isNumber(String s) {
		s=s.trim();
		if(s.length()==0)
			return false;
		if(s.length()==1){//���ֻ��һλ��ֻ��������
			if(s.charAt(0)-'0'<0||s.charAt(0)-'0'>9)
				return false;
			else
				return true;
		}
		
		boolean ret=true;
		int dianflag=0;
		int eflag=0;
		int loc=0;//��ǰλ��
		
		int num=s.charAt(loc)-'0';
		if(num<0||num>9){//��һλ�ǲ���+����.
			if(num+'0'=='+'||num+'0'=='-'){
				loc++;//�����һλ��+����-��loc��+1
			}		
		}
		num=s.charAt(loc)-'0';//�жϵ�һλ���ߵڶ�λ�ǲ��ǵ�
		if(num<0||num>9){
			if(num+'0'!='.')
				return false;
			else{
				dianflag=1;//˵����һ���ǵ�
				loc++;
				if(loc==s.length())
					return false;
			}
		}
		num=s.charAt(loc)-'0';
		if(dianflag==1){
			if(num+'0'=='e')//��ͷʱ���e��ͬʱ����
				return false;
		}
		while(loc<s.length()&&num>=0&&num<=9){//�ж��ǲ�������
			loc++;
			if(loc<s.length())
				num=s.charAt(loc)-'0';
		}
		
		if(loc<s.length()){//e�͵���ж�
			if(s.charAt(loc)!='e'&&s.charAt(loc)!='.'){//����e����.
				return false;
			}
			
			else{//�ǵ������e
				if(s.charAt(loc)=='.'){//���Ƿ��ظ�����
					if(dianflag==1)
						return false;
					else{
						loc++;
						dianflag=1;
						if(loc==s.length())//���ֺ����һ�������
							return true;
					}
				}
				else{			//��e
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
			while(loc<s.length()&&num>=0&&num<=9){//�ж��ǲ�������
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
