package lecture_8;
import java.util.*;
public class gspath_onthewayup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printstairpath(n,"");
	}
	
	public static void printstairpath(int n,String asf) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			System.out.println(asf);
			return;
		}
		
		printstairpath(n-1,asf + "1");
		printstairpath(n-2,asf + "2");
		printstairpath(n-3,asf + "3");
	}

}
