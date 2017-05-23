#include <iostream>
#include <string> 
using namespace std;

//���ö�̬�滮����L[i]��ֵ��ʾ��s[i]��β����������ַ��еĳ��ȡ�����ҳ�L��������ֵ�� 
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    	if(s.size()==0)
    		return 0;
   		else{
		   	int l[s.size()];//����¼ 
      		l[0]=1;//��ʼֵ
			for(int i=1;i<s.size();i++){
				l[i]=0;//�ȳ�ʼ��Ϊ0 
				int j=i-1; 
				for(;j>=(i-l[i-1]);j--){//��s[i]�Ƿ���l[i-1]���ȵ��ַ������С� 
					if(s[i]==s[j]){
						l[i]=i-j;
						break;
					}
				}
				if(j==(i-l[i-1]-1)){ 
					l[i]=l[i-1]+1;
				}					
			}
			int r=l[0];//�ҳ����ֵ 
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