
public class Solution_443 {
	public int compress(char[] chars) {
        int len=0;
        int nowpos=0;//���ڵ�λ��
        int prepos=0;//���ڱ��Ƚϵ��ַ�����ʼλ��
        int insertpos=0;//���Խ��в����λ��
        
        while(nowpos<chars.length) {
        	if(chars[nowpos]!=chars[prepos]) {
        		if(len==1) {
        			chars[insertpos++]=chars[prepos];
        		}
        		else {
        			chars[insertpos++]=chars[prepos];
        			//�ٲ������
        			String s="";
        			while(len!=0) {
        				s+=len%10;
        				len=len/10;
        			}
        			for(int i=s.length()-1;i>=0;i--)
        				chars[insertpos++]=s.charAt(i);
        		}
        		len=0;
        		prepos=nowpos;//������һ�����Ƚ��ַ���λ��
        	}
        	else {
        		nowpos++;
        		len++;
        	}
        }
        
        //�����һ���ַ����ж�
        if(len==1) {
			chars[insertpos++]=chars[nowpos-1];
		}
		else {
			chars[insertpos++]=chars[nowpos-1];
			//�ٲ������
			String s="";
			while(len!=0) {
				s+=len%10;
				len=len/10;
			}
			for(int i=s.length()-1;i>=0;i--)
				chars[insertpos++]=s.charAt(i);
		}
        
		return insertpos;
    }
}
