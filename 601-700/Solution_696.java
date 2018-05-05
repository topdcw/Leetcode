package top.guenon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution_696 {
	public int countBinarySubstrings(String s) {
//		int res=0;
//        int mid=s.length()/2;//���0��1�ĸ���
//        for(int i=1;i<=mid;i++) {
//        	//��ʼ����ƥ�䴮
//        	StringBuilder sb1=new StringBuilder();
//        	StringBuilder sb2=new StringBuilder();
//        	for(int j=0;j<i;j++) {
//        		sb1.insert(0, 0);
//        		sb1.append(1);
//        		sb2.insert(0, 1);
//        		sb2.append(0);
//        	}
//        	Pattern p1=Pattern.compile(sb1.toString());
//        	Pattern p2=Pattern.compile(sb2.toString());
//        	Matcher m1=p1.matcher(s);
//        	Matcher m2=p2.matcher(s);
//        	while(m1.find())
//        		res++;
//        	while(m2.find())
//        		res++;
//        }
//        return res;
		
		//����˼��,����ÿ������0��1�ĸ������з��顣����0011100��Ϊ3�飬ÿ��ֵΪ2,3,2��
		//��ôÿ��������Ŀ���ַ���������������������Ӵ�������00111����0011��01����
		int res=0;
		int []arr=new int[s.length()];
		char[]datas=s.toCharArray();//ת��Ϊ���飬Ϊ���潵������ʱ��
		int t=0;
		arr[0]=1;
		for(int i=1;i<datas.length;i++) {
			if(datas[i]!=datas[i-1]) {
				arr[++t]=1;
			}
			else {
				arr[t]++;
			}
		}
		for(int i=1;i<arr.length&&arr[i]!=0;i++) {
			res+=Math.min(arr[i], arr[i-1]);
		}
		return res;
    }
	public static void main(String[] args) {
		Solution_696 s=new Solution_696();
		System.out.println(s.countBinarySubstrings("00110"));
	}
}
