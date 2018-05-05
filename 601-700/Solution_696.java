package top.guenon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution_696 {
	public int countBinarySubstrings(String s) {
//		int res=0;
//        int mid=s.length()/2;//最多0或1的个数
//        for(int i=1;i<=mid;i++) {
//        	//开始构造匹配串
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
		
		//分组思想,按照每个连续0或1的个数进行分组。比如0011100分为3组，每组值为2,3,2。
		//那么每个符合题目的字符串存在于两个分组的连接处，比如00111，有0011和01两种
		int res=0;
		int []arr=new int[s.length()];
		char[]datas=s.toCharArray();//转换为数组，为后面降低运算时间
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
