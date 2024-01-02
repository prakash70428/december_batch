package lecture_3;
import java.util.*;
public class digit_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
       int ans = digitfrequency(n , d);
       System.out.println(ans);
	}
	
	public static int digitfrequency(int n ,int d) {
		int count = 0;
		
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			if(ld == d) {
				count++;
			}
		}
		
		return count ;
	}
	
	
	

}
