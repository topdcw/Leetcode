import java.util.ArrayList;

public class Solution_507 {
	//����һ�� ��������������ͳ������������������������֮����ȣ����ǳ���Ϊ������������
	//���������ӣ���ȥ�ж�
	
	 public boolean checkPerfectNumber(int num) {
	        if(num==1)
	            return false;
	        int mid=(int)Math.sqrt(num);
	        ArrayList<Integer> data=new ArrayList<>();
	        data.add(1);
	        for(int i=2;i<=mid;i++) {
	        	if(num%i==0) {
	        		data.add(i);
	        		data.add(num/i);
	        	}		
	        }
	        int res=0;
	        for(Integer i:data) {
	        	res+=i;
	        }
	        return res==num;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
