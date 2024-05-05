package lecture_10;
import java.util.*;
public class countbinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] dp1 = new int[n+1]; //ending at 0's
        int[] dp2 = new int[n+1]; //ending at 1's
        
        dp1[1] = 1;
        dp2[1] = 1;
        
        for(int i=2;i < dp1.length;i++) {
        	dp1[i] = dp2[i-1];
        	dp2[i] = dp1[i-1] + dp2[i-1];
        }
        
        System.out.println(dp1[n] + dp2[n]);
	}

}
 