#include <iostream>
#include <vector>

//��������������ĵ�KС������O(log(m+n)); 
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        //���ж����ܸ�������������ż����
		int n=nums1.size()+nums2.size();
		//������ת��Ϊ���� 
		int a[nums1.size()];
		int b[nums2.size()];
		for(int i=0;i<nums1.size();i++)
			a[i]=nums1[i];
		for(int i=0;i<nums2.size();i++)
			b[i]=nums2[i];
			 
	 	if(n%2==0){//ż����˵����λ������������ƽ��ֵ�� 
	 		int k1,k2;
			k1=n/2;
			k2=k1+1;
			double r=(order_k(a,nums1.size(),b,nums2.size(),k1)+order_k(a,nums1.size(),b,nums2.size(),k2))/2;
			return r;
	 	}
	 	else{
		 	int k=(n+1)/2;
			 return order_k(a,nums1.size(),b,nums2.size(),k);	
	 	} 
    }
    
   double order_k(int a[],int m,int b[],int n,int k){
   		if(m>n){
		   	return order_k(b,n,a,m,k);//��֤m<n    
  		}
  		if(m==0){
	 		return b[k-1];
	  	}
	 	if(k==1){
			return (a[0]<b[0]?a[0]:b[0]);
 		}
 		int h=(m<(k/2)?m:k/2);//�� a����ѡǰh��Ԫ��
		int p=k-h;//��b����ѡp��Ԫ�ء�
		if(a[h-1]<b[p-1])//˵��a�����ǰh��Ԫ����1-��k-1��С�������� 
			return(order_k(a+h,m-h,b,n,k-h));
		else
			if(a[h-1]==b[p-1])
				return b[p-1];
			else
				return(order_k(a,m,b+p,n-p,k-p));		  			
   		
   }
};

int main(int argc, char *argv[])
{
	vector<int>a;
	vector<int>b;
	a.push_back(1);
	a.push_back(3);
	b.push_back(2);
	b.push_back(4);
	
	Solution s;
	cout<<s.findMedianSortedArrays(a,b)<<endl;
	return 0;
}