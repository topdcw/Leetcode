#include <iostream>
using namespace std;
//int数回文判断，空间要求O(1) 
//负数均不回文
//利用翻转 
//max:2147483647,min:-2147483648,注意翻转后越界现象
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
				return false;//越界，说明肯定不是回文 
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