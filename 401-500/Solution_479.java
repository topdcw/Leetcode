import java.util.Arrays;

public class Solution_479 {
	//���뷶Χn��[1, 8]����n = 1���⣬����nֵ��������palindrome��λ����Ϊż��
	public int largestPalindrome(int n) {
        if(n==1)
        	return 9;
        long max=(long)Math.pow(10, n)-1;
        long min=max/10+1;
        for(long i=max;i>=min;i--) {
        	//��Ϊ�����������ַ���
        	String s=i+(new StringBuilder(Long.toString(i))).reverse().toString();
        	long huiwen=Long.parseLong(s);
        	
        	for(long j=max;huiwen/j<=max;j--) {
        		if(huiwen%j==0)
        			return (int) (huiwen%1337);
        	}
        	
        }
        return 1;
    }
	
	public static void main(String[] args) {
		
	}
}
