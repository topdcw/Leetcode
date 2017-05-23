#include <iostream>
#include <string>
using namespace std;
//最长回文子串 


class Solution {
public:
    string longestPalindrome(string s) {
    	//改造s，使其为#a#b#a#格式，方便去操作。
    	string new_s="$";
		for(int i=0;i<s.length();i++){
			new_s+='#';
			new_s+=s[i];
		}
		new_s+='#';
		cout<<new_s<<endl; 
        int p[2001],mx=0,id=0;//id表示最大回文子串的中心位置，mx为最大回文字符串的边界。
		memset(p,0,sizeof(p));
	 	for(int i=1;i<new_s.length();i++){
	 		if(mx>i){
		 		p[i]=(p[2*id-1]<(mx-i)?p[2*id-1]:(mx-i));
		 	}
		 	else
		 		p[i]=1;
			while(new_s[i+p[i]]==new_s[i-p[i]])
				p[i]++;
			if(i+p[i]>mx){
				mx=i+p[i];
				id=i;
			}
	 	}
 	 cout<<"id="<<id<<endl<<"mx="<<mx<<endl; 
 	 	string r_s="";
 	 	for(int j=id-mx+1;j<id+mx;j++){
	 	 	if(new_s[j]!='#'){
	 	 		r_s+=new_s[j];
	 	 	}
 	 	} 
        return r_s;
    }
};

int main(int argc, char *argv[])
{
	string str;
	cout<<"please input the string:";
	cin>>str;
	Solution s;
	cout<<"the long 回文子串是："<<s.longestPalindrome(str)<<endl; 
	return 0;
}