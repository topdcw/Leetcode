
//机器人有效的动作有 R（右），L（左），U（上）和 D（下）
public class Solution_657 {
	public boolean judgeCircle(String moves) {
        int Rnum=0,Lnum=0,Unum=0,Dnum=0;
        for(int i=0;i<moves.length();i++) {
        	if(moves.charAt(i)=='R')
        		Rnum++;
        	else if(moves.charAt(i)=='L')
        		Lnum++;
        	else if(moves.charAt(i)=='U')
        		Unum++;
        	else 
        		Dnum++;
        }
        return Rnum==Lnum&&Unum==Dnum;
    }
}
