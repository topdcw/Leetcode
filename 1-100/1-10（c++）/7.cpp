#include <iostream>
using namespace std;
/**
input:123,output:321
input:-123,output:-321
*/
//max:2147483647,min:-2147483648,注意翻转后越界现象：
//解决办法：1使用long long 存储，看最后结果是否越界。2，增加位数临界判断条件 .这里采用第一种 
class Solution {
public:
    int reverse(int x) {
    	long long r=0;
    	if(x==0)
    		return 0;
   		if(x>0){
			while(x!=0){
				r=r*10+x%10;
				x/=10;
			}
	   	}
	   	else{
	   		x=0-x;
	   		while(x!=0){
		   		r=r*10+x%10;
				x/=10;
		   	}
		   	r=0-r;
	   	}
	   	if(r>2147483647||r<-2147483648)
	   		return 0;
        return r;
    }
};

int main(int argc, char *argv[])
{
	
	return 0;
}