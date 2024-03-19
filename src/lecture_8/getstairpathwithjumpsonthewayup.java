package lecture_8;
import java.util.*;
public class getstairpathwithjumpsonthewayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printmazepaths(0,0,n-1,m-1,"");
	}
	
	public static void printmazepaths(int sr,int sc,int dr,int dc,String asf) {
		if(sr == dr && sc == dc) {
			System.out.println(asf);
			return;
		}
		
		for(int jump=1; jump <= dc-sc;jump++) {
			printmazepaths(sr,sc+jump,dr,dc,asf + "h" + jump);
		}
		
		for(int jump=1; jump <= dr-sr;jump++) {
			printmazepaths(sr+jump,sc,dr,dc,asf + "v" + jump);
		}
		
		for(int jump=1; jump <= dc-sc && jump <= dr-sr;jump++) {
			printmazepaths(sr+jump,sc+jump,dr,dc,asf + "d" + jump);
		}
		
		
	}

}
