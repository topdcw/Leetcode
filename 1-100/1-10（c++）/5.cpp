#include <iostream>
#include <string>
using namespace std;
//������Ӵ� 


class Solution {
public:
    string longestPalindrome(string s) {
    	//����s��ʹ��Ϊ#a#b#a#��ʽ������ȥ������
    	string new_s="$";
		for(int i=0;i<s.length();i++){
			new_s+='#';
			new_s+=s[i];
		}
		new_s+='#';
		cout<<new_s<<endl; 
        int p[2001],mx=0,id=0;//id��ʾ�������Ӵ�������λ�ã�mxΪ�������ַ����ı߽硣
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
	cout<<"the long �����Ӵ��ǣ�"<<s.longestPalindrome(str)<<endl; 
	return 0;
}