
public class Solution_443 {
	public int compress(char[] chars) {
        int len=0;
        int nowpos=0;//现在的位置
        int prepos=0;//正在被比较的字符的起始位置
        int insertpos=0;//可以进行插入的位置
        
        while(nowpos<chars.length) {
        	if(chars[nowpos]!=chars[prepos]) {
        		if(len==1) {
        			chars[insertpos++]=chars[prepos];
        		}
        		else {
        			chars[insertpos++]=chars[prepos];
        			//再插入个数
        			String s="";
        			while(len!=0) {
        				s+=len%10;
        				len=len/10;
        			}
        			for(int i=s.length()-1;i>=0;i--)
        				chars[insertpos++]=s.charAt(i);
        		}
        		len=0;
        		prepos=nowpos;//更新下一个被比较字符的位置
        	}
        	else {
        		nowpos++;
        		len++;
        	}
        }
        
        //对最后一个字符的判断
        if(len==1) {
			chars[insertpos++]=chars[nowpos-1];
		}
		else {
			chars[insertpos++]=chars[nowpos-1];
			//再插入个数
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
