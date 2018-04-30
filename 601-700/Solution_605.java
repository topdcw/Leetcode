
public class Solution_605 {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(flowerbed.length==1) {
			if(flowerbed[0]==0)
				return n<=1?true:false;
			else
				return n==0?true:false;
		}
		
		int max=0;//最多种花数量
		for(int i=0;i<flowerbed.length;) {
			if(flowerbed[i]==0) {
				if(i>0&&i<flowerbed.length-1) {
					if(flowerbed[i+1]==0&&flowerbed[i-1]==0){
						flowerbed[i]=1;
						max++;
						i++;
					}	
					else
						i+=1;
				}
				else {
					if(i==0) {
						if(flowerbed[i+1]==0) {
							flowerbed[i]=1;
							max++;
							i++;
						}	
						else
							i+=1;
					}
					else {
						if(flowerbed[i-1]==0) {
							flowerbed[i]=1;
							max++;
							i++;
						}	
						else
							i+=1;
					}
				}		
			}
			else
				i++;
		}
		
		return max>=n?true:false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_605 s=new Solution_605();
		System.out.println(s.canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2));
	}

}
