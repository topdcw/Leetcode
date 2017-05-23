#include <iostream>
using namespace std;
//p和s完全匹配，a*表示0个或者多个a


class Solution {
public:
    bool isMatch(string s, string p) {
		if(p.empty())//p为空 
			return s.empty();
		if(p.length()==1)//p长度为1 
			return(s.length()==1&&(s[0]==p[0]||p[0]=='.'));
		if(p[1]!='*'){//p第二位不为*号 
			if(s.empty())
				return false;
			return ((s[0]==p[0]||p[0]=='.')&&isMatch(s.substr(1),p.substr(1)));
		}
		//p第二位是*号,s[0]和p[0]匹配
		while(!s.empty()&&(s[0]==p[0]||p[0]=='.')){
			if(isMatch(s,p.substr(2))){
				return true;
			}
		//	cout<<"false!"<<endl;				
			s=s.substr(1);
		}
		//p第二位是*，且s[0]和p[0]不匹配。 
		return isMatch(s,p.substr(2));
    	
	}
}; 
int main(int argc, char *argv[])
{
	Solution s;
	cout<<"匹配结果是："<<s.isMatch("bb","b*")<<endl; 
	return 0;
}