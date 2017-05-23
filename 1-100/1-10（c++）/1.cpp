#include <iostream>
#include <vector>
#include <map> 
using namespace std;

class Solution {
	public:
    	vector<int> twoSum(vector<int>& nums, int target) {
    		//采用map表
    		vector<int> r;
			map<int,int> myhash;
		 	for(int i=0;i<nums.size();i++){
		 		//思路：先入map中，然后向前看。逐次判断。 
		 		if(!myhash.count(nums[i]))
	 				myhash[nums[i]]=i;
 				if(myhash.count(target-nums[i])){
				 	int n=myhash[target-nums[i]];
				 	if(n<i){
	 					r.push_back(n);
		 				r.push_back(i);
		 				break;
	 				}
			 	}
	 		}
	 		return r;
    	}
};

int main(int argc, char *argv[])
{
	Solution S;
	vector<int> in;
	int a,b,c;
	cin>>a>>b>>c;
	in.push_back(a); 
	in.push_back(b);
	in.push_back(c);
	vector<int> out=S.twoSum(in,6);
	cout<<out[0]<<out[1]<<endl;
	return 0;
}