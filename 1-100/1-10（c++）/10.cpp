#include <iostream>
using namespace std;
//p��s��ȫƥ�䣬a*��ʾ0�����߶��a


class Solution {
public:
    bool isMatch(string s, string p) {
		if(p.empty())//pΪ�� 
			return s.empty();
		if(p.length()==1)//p����Ϊ1 
			return(s.length()==1&&(s[0]==p[0]||p[0]=='.'));
		if(p[1]!='*'){//p�ڶ�λ��Ϊ*�� 
			if(s.empty())
				return false;
			return ((s[0]==p[0]||p[0]=='.')&&isMatch(s.substr(1),p.substr(1)));
		}
		//p�ڶ�λ��*��,s[0]��p[0]ƥ��
		while(!s.empty()&&(s[0]==p[0]||p[0]=='.')){
			if(isMatch(s,p.substr(2))){
				return true;
			}
		//	cout<<"false!"<<endl;				
			s=s.substr(1);
		}
		//p�ڶ�λ��*����s[0]��p[0]��ƥ�䡣 
		return isMatch(s,p.substr(2));
    	
	}
}; 
int main(int argc, char *argv[])
{
	Solution s;
	cout<<"ƥ�����ǣ�"<<s.isMatch("bb","b*")<<endl; 
	return 0;
}