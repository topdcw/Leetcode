#include <iostream>
using namespace std;
//int�������жϣ��ռ�Ҫ��O(1) 
//������������
//���÷�ת 
//max:2147483647,min:-2147483648,ע�ⷭת��Խ������
class Solution {
public:
    bool isPalindrome(int x) {
		int n=0,c=0;
		int y=x;        
        if(x<0)
        	return false;
       	while(y!=0){
       		c=y%10;
			if(n>214748364||(n==214748364&&c>7)){
				return false;//Խ�磬˵���϶����ǻ��� 
			}
		   	n=n*10+c;
		   	y/=10;
  		}
  		if(n==x)
	  		return true;
		else
			return false;  
    }
};

int main(int argc, char *argv[])
{
	Solution s;
	cout<<s.isPalindrome(1)<<endl;
	return 0;
}