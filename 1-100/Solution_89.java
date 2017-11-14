/**
 * Created by SiceLab on 2017/11/14.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *Gray Code
 * 求格雷码
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 */
public class Solution_89 {
    //二进制码->格雷码（编码）
    //从最右边一位起，依次将每一位与左边一位异或(XOR)，
    // 作为对应格雷码该位的值，最左边一位不变(相当于左边是0)
    public List<Integer> grayCode(int n) {
        List<Integer> ret=new ArrayList<>();
        int num=(int)Math.pow(2,n)-1;
        for (int i=0;i<=num;i++){
            String tmp=Integer.toBinaryString(i);
            while(tmp.length()<n)
                tmp="0"+tmp;
            StringBuilder sb=new StringBuilder();
            for (int j=n-1;j>0;j--){
                sb.append((tmp.charAt(j)-'0')^(tmp.charAt(j-1)-'0'));
            }
            sb.append(tmp.charAt(0));

            ret.add(Integer.parseInt(sb.reverse().toString(),2));
        }


        return ret;
    }

    public static void main(String[] args) {
        System.out.printf(Integer.toBinaryString(0));
    }
}
