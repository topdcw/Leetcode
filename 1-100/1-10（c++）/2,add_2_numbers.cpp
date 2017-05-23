#include <iostream>
using namespace std;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 
struct ListNode {
    int val;
    ListNode *next;
	ListNode(int x) : val(x), next(NULL) {}
};
 
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    	struct ListNode *head,*p,*n;
        int c=0;//进位符
        int num=0;//标识位数 
		while(l1||l2){//l1和l2至少一个不为空 
			if(l1&&l2){//均不为空 
				n=new ListNode((l1->val+l2->val+c)%10);//先留下 
				c=int((l1->val+l2->val+c)/10);//再更新进位 
				if(num==0){
					head=p=n;
					l1=l1->next;
					l2=l2->next;
					num++;
				}
				else{
					p->next=n;
					p=n;
					num++; 
					l1=l1->next;
					l2=l2->next;
				}
			}
			else if(!l1){//l1为空 
					n=new ListNode((l2->val+c)%10);
					c=int((l2->val+c)/10);//进位 
					if(num==0){
						head=p=n;
						l2=l2->next;
						num++;
					}
					else{
						p->next=n;
						p=n;
						num++; 
						l2=l2->next;
					}
				}
				else{//l2为空 
					n=new ListNode((l1->val+c)%10);
					c=int((l1->val+c)/10);//进位 
					if(num==0){
						head=p=n;
						l1=l1->next;
						num++;
					}
					else{
						p->next=n;
						p=n;
						num++; 
						l1=l1->next;
						
					}
				}
		}
		if(c!=0){//最高位 
			n=new ListNode(c);
			p->next=n;
		}
		
        return head; 
    }
};

int main(int argc, char *argv[])
{
	struct ListNode *l1,*l2,*p,*n,*r;
	l1=p=n=new ListNode(2);
	n=new ListNode(4);
	p->next=n;
	p=n;
	n=new ListNode(3);
	p->next=n;
	p=n;
	
	l2=p=n=new ListNode(5);
	n=new ListNode(6);
	p->next=n;
	p=n;
	n=new ListNode(4);
	p->next=n;
	p=n;
	
	Solution s;
	r=s.addTwoNumbers(l1,l2);
	while(r){
		cout<<r->val;
		r=r->next; 
	}
	return 0;
}