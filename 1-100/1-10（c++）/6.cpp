#include <iostream>
using namespace std;

class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1||s=="")
        	return s;
       	string resultString="";
       	//ÿ�����,�����м���
		int n=(numRows-1)*2;
		int num=1+s.length()/n;
		
		string str[num][numRows];//�ֱ�洢ÿһ���ÿһ���ַ�����Ϣ
		for(int i=0;i<num-1;i++){//��ǰnum-1����д��� 
			for(int j=0;j<numRows;j++){
				if(j==0||j==(numRows-1))
					str[i][j]=str[i][j]+s[i*n+j];
				else
					str[i][j]=str[i][j]+s[i*n+j]+s[i*n+2*(numRows-1)-j];
			}
		}
		//�������һ��
		int last_n=s.length()-n*(num-1);//���һ����� 
		if(last_n>0){
			if(last_n<=numRows){
				for(int j=0;j<last_n;j++){
					str[num-1][j]=str[num-1][j]+s[(num-1)*n+j];
				}
			}
			else{
				for(int j=0;j<numRows;j++){
					if(j==0||j==(numRows-1))
						str[num-1][j]=str[num-1][j]+s[(num-1)*n+j];
					else{
						if(2*(numRows-1)-j+1>last_n)
							str[num-1][j]=str[num-1][j]+s[(num-1)*n+j];
						else
							str[num-1][j]=str[num-1][j]+s[(num-1)*n+j]+s[(num-1)*n+2*(numRows-1)-j];			
					}
				}
			}
		}
		
		for(int i=0;i<numRows;i++)
			for(int j=0;j<num;j++){
				resultString=resultString+str[j][i];
			}
		return resultString;
    }
};

int main(int argc, char *argv[])
{
	Solution s;
	string str="PAYPALISHIRING";
	cout<<s.convert(str,3)<<endl;
	return 0;
}