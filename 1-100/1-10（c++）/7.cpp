#include <iostream>
using namespace std;
/**
input:123,output:321
input:-123,output:-321
*/
//max:2147483647,min:-2147483648,ע�ⷭת��Խ������
//����취��1ʹ��long long �洢����������Ƿ�Խ�硣2������λ���ٽ��ж����� .������õ�һ�� 
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