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
        //创建一个空的头结点
		p=head=new ListNode(0); 
		while(l1||l2){//l1和l2至少一个不为空 
			int x,y;
			x=y=0;
			if(l1){
				x=l1->val;
				l1=l1->next;
			}
				
			if(l2){
				y=l2->val;
				l2=l2->next;
			}
				
			n=new ListNode((x+y+c)%10);
			p->next=n;
			p=n;
			c=int((x+y+c)/10);
			
		}
		if(c!=0){//最高位 
			n=new ListNode(c);
			p->next=n;
		}
		
        return head->next; 
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