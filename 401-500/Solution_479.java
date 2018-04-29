import java.util.Arrays;

public class Solution_479 {
	//输入范围n∈[1, 8]，除n = 1以外，其余n值最大回文数palindrome的位数均为偶数
	public int largestPalindrome(int n) {
        if(n==1)
        	return 9;
        long max=(long)Math.pow(10, n)-1;
        long min=max/10+1;
        for(long i=max;i>=min;i--) {
        	//人为构造最大回文字符串
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
