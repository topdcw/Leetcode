#include <iostream>
#include <string> 
using namespace std;

//采用动态规划，设L[i]的值表示以s[i]结尾的最长的连续字符列的长度。最后找出L数组的最大值。 
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    	if(s.size()==0)
    		return 0;
   		else{
		   	int l[s.size()];//备忘录 
      		l[0]=1;//初始值
			for(int i=1;i<s.size();i++){
				l[i]=0;//先初始化为0 
				int j=i-1; 
				for(;j>=(i-l[i-1]);j--){//看s[i]是否在l[i-1]长度的字符序列中。 
					if(s[i]==s[j]){
						l[i]=i-j;
						break;
					}
				}
				if(j==(i-l[i-1]-1)){ 
					l[i]=l[i-1]+1;
				}					
			}
			int r=l[0];//找出最大值 
			for(int i=1;i<s.size();i++){			
				if(r<l[i]) 
					r=l[i];
			}
			return r;
   		}	
    }
};


int main(int argc, char *argv[])
{
	string s;
	Solution my_s;
	cin>>s;
	int r=my_s.lengthOfLongestSubstring(s); 
	cout<<r<<endl; 
	return 0;
}