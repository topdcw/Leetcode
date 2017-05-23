#include <iostream>
using namespace std;

//String to int
//INT_MAX (2147483647) or INT_MIN (-2147483648)
//先判空
//开头空格去除
//正负判定
//转换，遇到不是数字停止。并溢出处理。 
//不满足转换的均返回为0 
 
class Solution {
public:
    int myAtoi(string str) {
        int n=0,c=0;
        int intSign=1;//默认为+ 
        if(str=="")//空
        	return 0;
   		while(str!=""&&str[0]==' ')//清除空格 
   			str=str.erase(0,1);
		if(str=="")//去除空格后再次判空
        	return 0;
		if(str[0]=='-'||str[0]=='+'){//正负判断 
			if(str[0]=='-'){
				intSign=-1;	
			}
			str=str.erase(0,1);
		}
		for(int i=0;i<str.length();i++){
			if(str[i]<'0'||str[i]>'9')//遇到不是数字，停止转换 
				break;
			c=str[i]-'0';
			if(intSign>0&&(n>214748364||(n==214748364&&c>7))){
				n= 2147483647;
				return n;
			}
			if(intSign<0&&(n>214748364||(n==214748364&&c>=8))){
				n=-2147483648;
				return n;
			}
			n=n*10+c;
			
		}
		
		if(intSign>0)
			return n;
		else
			return -n;   		
    }
};

int main(int argc, char *argv[])
{
	Solution s;
	
	cout<<s.myAtoi("1234567")<<endl;
	return 0;
}