#include <iostream>
using namespace std;
/**
input:123,output:321
input:-123,output:-321
*/
//max:2147483647,min:-2147483648,ע�ⷭת��Խ������
//����취��1ʹ��long long �洢����������Ƿ�Խ�硣2������λ���ٽ��ж����� .������õ�2�� 
class Solution {
public:
    int reverse(int x) {
    	int r=0;
    	if(x==0)
    		return 0;
   		if(x>0){
			while(x!=0){
				if(r>214748364||(r==214748364&&x%10>7))
					return 0;
				r=r*10+x%10;
				x/=10;
			}
	   	}
	   	else{
	   		if(x==-2147483648)
	   			return 0;
	   		x=0-x;
	   		while(x!=0){
	   			if(r>214748364||(r==214748364&&x%10>7))
					return 0;
		   		r=r*10+x%10;
				x/=10;
		   	}
		   	r=0-r;
	   	}
	   	
        return r;
    }
};

int main(int argc, char *argv[])
{
	
	return 0;
}