package lecture_7;
import java.util.*;
public class power_logarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int ans = powerlogarithm(x,n);
        System.out.println(ans);
	}
	
	public static int powerlogarithm(int x,int n) {
		if(n == 0) {
			return 1;
		}
		
		int xpnby2 = powerlogarithm(x,n/2);
		int xpn = xpnby2 * xpnby2;
		if(n%2 != 0) {
			 xpn *= x;
		}
		
		return xpn;
	}

}
