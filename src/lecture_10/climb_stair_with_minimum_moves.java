package lecture_10;
import java.util.*;
public class climb_stair_with_minimum_moves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        System.out.println(minMoves(arr));
	}
	
	public static int minMoves(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		
		dp[n-1] = 0; //dest -> dest (min steps)
		
		for(int i=n-2;i >= 0;i--) {
			int min = Integer.MAX_VALUE - 1;
			for(int jump=1;jump <= arr[i];jump++) {
				if(i+jump < dp.length) {
					min = Math.min(min,dp[i + jump]);
				}		
			}
			
			dp[i] = min + 1;
		}
		
		return dp[0];
	}

}
